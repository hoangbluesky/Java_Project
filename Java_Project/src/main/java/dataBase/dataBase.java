/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataBase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class dataBase {
    
    
    public static Connection getConnection(){
        try {
            // B1: Nạp driver vào project
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // B2: Tạo kết nối đến CSDL
            String sqlUrl = "jdbc:sqlserver://localhost:1433;databaseName=JAVA_PROJECT_QLNHANVIEN;encrypt=false;";
            Connection conn = DriverManager.getConnection(sqlUrl, "sa", "123456");
            return conn;
            
        } catch (Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
            Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return null;
    }
    
   
}
