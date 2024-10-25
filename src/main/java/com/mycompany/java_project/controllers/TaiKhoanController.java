/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.controllers;

import com.mycompany.java_project.models.TaiKhoan;
import java.sql.Connection;
import java.sql.SQLException;
import dataBase.dataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dell
 */
public class TaiKhoanController {
    dataBase db = new dataBase();
    public static TaiKhoanController getInstance(){
        return new TaiKhoanController();
    }
    public List<TaiKhoan> getAllName(String taikhoan,String mkhau){
        List<TaiKhoan> lst = new ArrayList<>();
        try {
            Connection conn = dataBase.getConnection();
            
            String query = "select * from TAIKHOAN where TENDANGNHAP = ? and MATKHAU = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, taikhoan);
            ps.setString(2, mkhau);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                TaiKhoan obj = new TaiKhoan();
                obj.setTenDangNHap(rs.getString("TENDANGNHAP"));
                obj.setPassWord(rs.getString("MATKHAU"));
                lst.add(obj);
            }
            return lst;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void DangKy(TaiKhoan obj) throws SQLException {
        String sql = "Insert into TAIKHOAN values(?,?,?)";
        try( Connection conn = dataBase.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, obj.getSoDT());
            pstmt.setString(2, obj.getTenDangNHap());
            pstmt.setString(3, obj.getPassWord());

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }
            conn.close();

    }catch(Exception ex) {
            System.out.println("Loi: " + ex.getMessage());
            Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public boolean DangNhap(String taiKhoan, String mKhau) throws SQLException
    {
        String sql = "select * from TAIKHOAN where TENDANGNHAP = ? and MATKHAU = ?";
            
            
        try{
            Connection conn = dataBase.getConnection();
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, taiKhoan);
            ps.setString(2, mKhau);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            int rowCount =-1;
            if(rs.next()){
                 rowCount++;
            }
            if(rowCount >= 0){
                return true;
            }
        }catch(SQLException ex) {
            System.out.println("Loi: " + ex.getMessage());
            Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return false;
    }
    
}
