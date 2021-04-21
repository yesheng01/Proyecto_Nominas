/**
 * PACKAGE_NAME
 * Nombre_project: BaseDeDatos
 * DataBase
 * Created by: sheng
 * Date : 12/03/2021
 * Description:
 **/
import  java.sql.*;

public class Queries {
    private static Connection connect = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String url = "jdbc:mysql://localhost:3306/nominas";
    private static String user = "root", pass = ""; //Esto hay que cambiarlo , es depende de que ordenador esteis

    public static void main(String[] args) {
        // This will load the MySQL driver, each DB has its own driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Esto tambien puede qeu os pida que cambie
            connect = DriverManager.getConnection(url, user, pass);
            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from empleados");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
