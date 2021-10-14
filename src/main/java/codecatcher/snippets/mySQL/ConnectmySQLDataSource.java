package codecatcher.snippets.mySQL;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectmySQLDataSource {

    public static void main(String[] args) {

        String url= "jdbc:mysql://localhost:3306/";
        String schema = "wild_db_quest";
        String user = "javagod";
        String password = "NoClue2021";
        String strQuery = "select * from school";
        MysqlDataSource mysqlDS = null;

        try{
            mysqlDS = new MysqlDataSource();

            mysqlDS.setURL(url + schema);
            mysqlDS.setUser(user);
            mysqlDS.setPassword(password);

            Connection conn = mysqlDS.getConnection();
            Statement myStatement = conn.createStatement();
            ResultSet myResultSet = myStatement.executeQuery(strQuery);
            while(myResultSet.next())
                System.out.println(myResultSet.getInt(1) + "  " +
                        myResultSet.getString(2) + "  " +
                        myResultSet.getString(3));
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
