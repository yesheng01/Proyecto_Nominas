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
        conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/nominas2021","admincide","Cide2021");
    }
    public void tancar()throws Exception{
        conn.close();
    }
    public void empleado(){

    }
}
