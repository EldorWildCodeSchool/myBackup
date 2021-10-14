package codecatcher.snippets.mySQL;

import java.sql.*;


public class ConnectMySQLDataSourceDBUtils {

    public static void main(String[] args) {

        String user = "javagod";
        String password = "NoClue2021";
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbSchema = "wild_db_quest";
        String strQuery = "select * from school";

        DataBaseConnectionPersistance myDBPersistance = new DBUtils(dbURL, dbSchema, user, password);

        try (Connection myConnection = myDBPersistance.getMySQLConnectionDS()) {
            if (myConnection != null) {
                Statement myStatement = myConnection.createStatement();
                ResultSet myResultSet = myStatement.executeQuery(strQuery);
                int metaData = myResultSet.getMetaData().getColumnCount();
                while (myResultSet.next()) {
                    System.out.print(myResultSet.getInt(1) + "  " +
                    myResultSet.getString(2) + "  " +
                    myResultSet.getInt(3) + "  " +
                    myResultSet.getString(4));
                    System.out.println();
                }
                myConnection.close();
            } else {
                System.err.println("Connection error!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
