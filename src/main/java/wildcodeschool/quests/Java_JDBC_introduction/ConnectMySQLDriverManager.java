package wildcodeschool.quests.Java_JDBC_introduction;

import java.sql.*;
import java.util.Scanner;

public class ConnectMySQLDriverManager {

    public static void main(String args[]) {

        // Set connection and user information for database connection
        // final String mySQLDriver = "com.mysql.cj.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/";
        final String schema = "wild_db_jdbc_introduction";
        final String user = "simpleuser";
        final String password = "NoClue2021$";

        // Open Connection to Database
        Connection conn = getMyConnection(url, schema, user, password);

        // Fill some values into an array to be filled into persons table later on
        String[][] myPersons = {{"Papa", "Barba", "42"},
                {"Mama", "Barba", "28"},
                {"Bella", "Barba", "16"},
                {"Wum", "Barba", "18"},
                };

        try {
            // Print out initial content of table
            System.out.println("\n--- \t INITIAL TABLE \t ---");
            getPersons(conn);

            // Insert prepared data from array into persons table
            for (int row = 0; row < myPersons.length; row++) {
                insertIntoPersons(conn, myPersons[row][0], myPersons[row][1], Integer.parseInt(myPersons[row][2]));
            }
            // Print out the content of the filled up persons table
            System.out.println("\n--- \t FILLED UP TABLE \t ---");
            getPersons(conn);

            // Update one dataset with prepared statement
            updatePersonLastnameByFirstname(conn, "I HAVE BEEN UPDATED", "Wum");
            // Print out the content of the updated persons table
            System.out.println("\n--- \t UPDATED TABLE \t ---");
            getPersons(conn);

            // Remove all non-initial datasets from persons table
            deletePersonByLastname(conn, "Barba");
            deletePersonByLastname(conn, "I HAVE%");

            // Print out the content of the adjusted persons table
            System.out.println("\n--- \t ADJUSTED TABLE \t ---");
            getPersons(conn);

            // Implement vulnerable SQL statement because of the use of String concatentation
            //Hint: https://owasp.org/www-community/attacks/SQL_Injection
            Scanner mySQLScanner = new Scanner(System.in);
            String myAddSQLString;
            do {
                System.out.println("\n--- \t TEST OF SQL INJECTION TABLE \t ---");
                System.out.println("Hint: --> Name' OR 'a'='a <--  would lead to an injection error/hack. 'Connor' is an example for a valid input. 'exit' exits the scanner-loop ");
                System.err.println("Please specify the WHERE condition for the SQL statement 'SELECT * FROM persons WHERE lastname like --INPUT--': ");
                myAddSQLString = mySQLScanner.nextLine();
                Statement myInjectedSQLStatement = conn.createStatement();
                String myInjectedSQLQuery = "SELECT * FROM persons where lastname = '" + myAddSQLString + "'";
                System.out.println("\nThe SQL statement to be executed is: " + myInjectedSQLQuery);
                ResultSet myInjectedSQLResultSet = myInjectedSQLStatement.executeQuery(myInjectedSQLQuery);
                System.out.println("The query resul is:");
                while (myInjectedSQLResultSet.next()) {
                    System.out.println(myInjectedSQLResultSet.getString(1) + "  " +
                            myInjectedSQLResultSet.getString(2) + "  " +
                            myInjectedSQLResultSet.getInt(3));
                }
                myInjectedSQLStatement.close();
                myInjectedSQLResultSet.close();
            } while (!"exit".equals(myAddSQLString));


            // Finaly close the connection to database
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // This method prints the content of persons table
    private static void getPersons(Connection conn) {
        Statement myStatement = null;
        try {
            myStatement = conn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from persons");
            while (myResultSet.next())
                System.out.println(myResultSet.getString(1) + "  " +
                        myResultSet.getString(2) + "  " +
                        myResultSet.getInt(3));
            myStatement.close();
            myResultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deletePersonByLastname(Connection conn, String delLastname){
        PreparedStatement myPrepStatement = null;
        try {
            myPrepStatement = conn.prepareStatement("DELETE FROM persons WHERE lastname like ?");
            myPrepStatement.setString(1, delLastname);
            myPrepStatement.execute();
            myPrepStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updatePersonLastnameByFirstname(Connection conn, String updLastname, String findFirstname){
        PreparedStatement myPrepStatement = null;
        try {
            myPrepStatement = conn.prepareStatement("UPDATE persons SET lastname=? WHERE firstname=?");
            myPrepStatement.setString(1, updLastname);
            myPrepStatement.setString(2, findFirstname);
            myPrepStatement.execute();
            myPrepStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertIntoPersons(Connection conn, String firstname, String lastname, Integer age){
        PreparedStatement myPrepStatement = null;
        try {
            myPrepStatement = conn.prepareStatement("INSERT INTO persons (firstname, lastname, age) VALUES (?, ?, ?)");
            myPrepStatement.setString(1, firstname);
            myPrepStatement.setString(2, lastname);
            myPrepStatement.setInt(3, age);
            myPrepStatement.execute();
            myPrepStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // This method opens a connection to the database and returns it as a connection
    private static Connection getMyConnection(String url, String schema, String user, String password) {
        //Invoke mySQL driver class with fully qualified name ("com.mysql.cj.jdbc.Driver")
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(((url + schema)), user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}