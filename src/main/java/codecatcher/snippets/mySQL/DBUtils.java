package codecatcher.snippets.mySQL;


import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils implements DataBaseConnectionPersistance{

    private final String user;
    private final String password;
    private final String dbURL;
    private final String dbSchema;

    public DBUtils(String dbURL, String dbSchema, String user, String password) {
        this.user = user;
        this.password = password;
        this.dbURL = dbURL;
        this.dbSchema = dbSchema;
    }
    @Override
    public Connection getMySQLConnectionDS() {

        MysqlDataSource mysqlDS = null;
        Connection myConnection = null;
        try {
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL(dbURL + dbSchema);
            mysqlDS.setUser(user);
            mysqlDS.setPassword(password);

            myConnection = mysqlDS.getConnection();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return myConnection;
    }
}
