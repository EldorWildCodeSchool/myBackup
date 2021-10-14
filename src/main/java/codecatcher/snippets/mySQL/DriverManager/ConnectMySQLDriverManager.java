package codecatcher.snippets.mySQL.DriverManager;

import java.sql.*;

public class ConnectMySQLDriverManager {

    public static void main(String args[]) {

        String mySQLDriver = "com.mysql.cj.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/";
        String schema = "wild_db_quest";
        String user = "javagod";
        String password = "NoClue2021";
        String strQuery = "select * from school";

        try {
            //Invoke mySQL driver class with fully qualified name ("com.mysql.cj.jdbc.Driver")
            Class.forName(mySQLDriver);
            Connection conn = DriverManager.getConnection(((url + schema)),user,password);
            Statement myStatement = conn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery(strQuery);
            while(myResultSet.next())
                System.out.println(myResultSet.getInt(1) + "  " +
                        myResultSet.getString(2) + "  " +
                        myResultSet.getString(3));
            conn.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            }
        }
}

