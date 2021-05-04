/*
  PACKAGE_NAME
  Nombre_project: BaseDeDatos
  DataBase
  Created by: Sheng Diego y Daniel
  Date : 12/03/2021
  Description:
 */
import  java.sql.*;


public class Queries {

    public static void main(String[] args) {
        // This will load the MySQL driver, each DB has its own driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Esto tambien puede qeu os pida que cambie
            String url = "jdbc:mysql://db4free.net:3306/nominas2021";
            String user = "admincide";
            String pass = "Cide2021";
            Connection connect = DriverManager.getConnection(url, user, pass);
            // Statements allow to issue SQL queries to the database
            Statement statement = connect.createStatement();
            // Result set get the result of the SQL query
            ResultSet resultSet = statement.executeQuery("select * from empleados");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}