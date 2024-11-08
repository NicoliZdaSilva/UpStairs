package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String URL = "jdbc:postgresql://localhost:5432/upstairs";
    private static final String USER = "postgres";
    private static final String PASSWORD = "9973155";
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
