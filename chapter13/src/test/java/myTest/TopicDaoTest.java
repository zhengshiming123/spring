package myTest;

import com.mysql.jdbc.ConnectionGroupManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by h on 2017/11/6.
 */
public class TopicDaoTest {

    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    public static Connection getConnection(){

        if (connectionThreadLocal.get() == null) {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connectionThreadLocal.set(conn);
            return conn;
        }else {
            return connectionThreadLocal.get();
        }
//        return null;
    }


    public void addTopic(){
        try {
            //从ThreadLocal中获取线程对应的Connection
            Statement statement = getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
