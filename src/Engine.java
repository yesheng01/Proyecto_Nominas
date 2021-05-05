import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class Engine {
    Connection conn;
    private PreparedStatement selectAllDni;


    public Engine() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://bq7xcggx4wgir1svxet5-mysql.services.clever-cloud.com:3306/bq7xcggx4wgir1svxet5","ucaywecixura7e1v","z20eE9b0KKtixeD35nHS");
    }
    public void tancar()throws Exception{
        conn.close();
    }
    public void empleado(){

    }
}
