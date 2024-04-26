
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sadik
 */
public class DbHelper {
    private String userName = "root";
    private String password = "123456";
    private String dbUrl = "jdbc:mysql://localhost:3306/northwind";

    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void ShowSqlException(SQLException exception){
        System.out.println("Hata mesajı :"+exception.getMessage());
        System.out.println("Hata kodu :"+exception.getErrorCode());

    }
    
    
}
