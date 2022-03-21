package datos;

import java.sql.*;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection( JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void Close(ResultSet resultSet){
        try{
            resultSet.close();
        } catch (SQLException exception){
            exception.printStackTrace(System.out);
        }
    }

    public static void Close(PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
        } catch (SQLException exception){
            exception.printStackTrace(System.out);
        }
    }

    public static void Close(Connection connection){
        try {
            connection.close();
        } catch (SQLException exception){
            exception.printStackTrace(System.out);
        }
    }

}
