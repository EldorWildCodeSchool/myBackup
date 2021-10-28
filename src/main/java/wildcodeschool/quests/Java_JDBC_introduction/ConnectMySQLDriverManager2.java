package wildcodeschool.quests.Java_JDBC_introduction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectMySQLDriverManager2 {

    public static void main(String args[]) {

        // Set connection and user information for database connection
        // final String mySQLDriver = "com.mysql.cj.jdbc.Driver";
        final String url = "jdbc:mysql://localhost:3306/";
        final String schema = "wild_db_jdbc_introduction";
        final String user = "simpleuser";
        final String password = "NoClue2021$";

        try {
            // Open Connection to database and inizialize the table 'persons'
            Connection conn = getMyConnection(url, schema, user, password);
            initializeTable(conn);

            // Print out initial content of table
            System.out.println("\n--- \t INITIAL TABLE \t ---");
            getPersons(conn);

            // Insert entires into persons table and print out the result
            List<String> sqlStmtContainer = new ArrayList<>();
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Papa', 'Barba', 42);");
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Mama', 'Barba', 38);");
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Bella', 'Barba', 18);");
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Wum', 'Barba', 42);");
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Johann Wolfgang', 'von Goethe', 270);");
            sqlStmtContainer.add("INSERT INTO persons VALUES ('Gottfried Wilhelm', 'Leibniz', 375);");
            cudOnPerson(conn, sqlStmtContainer);
            sqlStmtContainer.clear();
            System.out.println("\n--- \t FILLED UP TABLE \t ---");
            getPersons(conn);

            // Update one dataset with prepared statement and print out the result
            sqlStmtContainer.add("UPDATE persons SET lastname='I HAVE BEEN UPDATED' WHERE firstname='Wum'");
            cudOnPerson(conn, sqlStmtContainer);
            sqlStmtContainer.clear();
            System.out.println("\n--- \t UPDATED TABLE \t ---");
            getPersons(conn);

            // Remove all non-initial datasets from persons table and print out the result
            sqlStmtContainer.add("DELETE FROM persons WHERE lastname IN ('Barba','I HAVE BEEN UPDATED')");
            cudOnPerson(conn, sqlStmtContainer);
            sqlStmtContainer.clear();
            System.out.println("\n--- \t ADJUSTED TABLE \t ---");
            getPersons(conn);

            // Implement vulnerable SQL statement because of the use of String concatentation
            // Hint: https://owasp.org/www-community/attacks/SQL_Injection
            // User can try to inject SQL in a loop via system.in. The loop can be left by entering 'exit'
            Scanner mySQLScanner = new Scanner(System.in);
            String myAddSQLString;
            do {
                System.out.println("\n--- \t TEST OF SQL INJECTION \t ---");
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Inizialize and even create table (if needed) persons because of tests with the SQL injection
    private static void initializeTable(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();
        List<String> sqlStatements = new ArrayList<>();
        if (! conn.getMetaData().getTables(null, null, "persons", null).next()){
            sqlStatements.add("CREATE TABLE persons (firstname VARCHAR(30), lastname VARCHAR(30), age INTEGER);");
            } else {
            sqlStatements.add("TRUNCATE TABLE persons;");
            }
        sqlStatements.add("INSERT INTO persons VALUES ('John', 'Smith', 31);");
        sqlStatements.add("INSERT INTO persons VALUES ('Sarah', 'Connor', 29);");
        for (String sql : sqlStatements){
            stmt.execute(sql);
        }
    }

    // This method prints the content of persons table
    private static void getPersons(Connection conn) throws SQLException {
            Statement myStatement = conn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery("select * from persons");
            while (myResultSet.next())
                System.out.println(myResultSet.getString(1) + "  " +
                        myResultSet.getString(2) + "  " +
                        myResultSet.getInt(3));
            myStatement.close();
            myResultSet.close();
    }

    // This method executes create, update and  delete (cud) statements against the database
    private static void cudOnPerson(Connection conn, List<String> cudStatements) throws SQLException {
        Statement stmt = conn.createStatement();
        if (conn.getMetaData().getTables(null, null, "persons", null).next()){
            for (String cudStatement : cudStatements){
                stmt.execute(cudStatement);
            }
        }
        stmt.close();
    }

    // This method opens a connection to the database and returns it as a connection
    private static Connection getMyConnection(String url, String schema, String user, String password) throws ClassNotFoundException, SQLException {
        //Invoke mySQL driver class with fully qualified name ("com.mysql.cj.jdbc.Driver")
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(((url + schema)), user, password);
            return conn;
    }
}