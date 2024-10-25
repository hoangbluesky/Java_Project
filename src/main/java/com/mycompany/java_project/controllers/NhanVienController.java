/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.controllers;

import com.mycompany.java_project.models.*;
import dataBase.dataBase;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Dell
 */
public class NhanVienController {
    
    dataBase db = new dataBase();
    public List<NhanVien> getAll(){
        List<NhanVien> lst = new ArrayList<>();
        try {
            Connection conn = dataBase.getConnection();
            
            String query = "select * from NHANVIEN";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanVien obj = new NhanVien();
                obj.setMaNhanVien(rs.getString("MANV"));
                obj.setTenNhanVien(rs.getString("TENNV"));
                obj.setNgaySinh(rs.getDate("NGAYSINH"));
                obj.setGioiTinh(rs.getString("GIOITINH"));
                obj.setDiaChi(rs.getString("DIACHI"));
                obj.setMaChucVu(rs.getString("MACV"));
                obj.setMaPhong(rs.getString("MAPHONG"));
                obj.setMaHopDong(rs.getString("MAHD"));
                obj.setMaToDoi(rs.getString("MATD"));
                lst.add(obj);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }
    public NhanVien getKey(String key){
        try {
            Connection conn = dataBase.getConnection();
            
            String query = "select * from NHANVIEN where MANV = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, key);
            
            ResultSet rs = ps.executeQuery();
            boolean check = rs.next();
            if(check==true){
                NhanVien obj = new NhanVien();
                obj.setMaNhanVien(rs.getString("MANV"));
                obj.setTenNhanVien(rs.getString("TENNV"));
                obj.setNgaySinh(rs.getDate("NGAYSINH"));
                obj.setGioiTinh(rs.getString("GIOITINH"));
                obj.setDiaChi(rs.getString("DIACHI"));
                obj.setMaChucVu(rs.getString("MACV"));
                obj.setMaPhong(rs.getString("MAPHONG"));
                obj.setMaHopDong(rs.getString("MAHD"));
                obj.setMaToDoi(rs.getString("MATD"));
                return obj;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean them(NhanVien obj){
        try {
            Connection conn = dataBase.getConnection();
            
            String query = "insert into NHANVIEN values(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1,obj.getMaNhanVien());
            ps.setString(2,obj.getTenNhanVien());
            ps.setDate(3,new Date(obj.getNgaySinh().getTime()));
            ps.setString(4,obj.getGioiTinh());
            ps.setString(5,obj.getDiaChi());
            ps.setString(6,obj.getMaChucVu());
            ps.setString(7,obj.getMaPhong());
            ps.setString(8,obj.getMaHopDong());
            ps.setString(9,obj.getMaToDoi());
            
            int r = ps.executeUpdate();
            return r>0;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean sua(NhanVien obj){
        try {
            Connection conn = db.getConnection();
            
            String query = "update NHANVIEN set TENNV = ?, NGAYSINH=?, GIOITINH=?, DIACHI=?, MACV=?, MAPHONG=?, MAHD=?, MATD=? WHRER MANV=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1,obj.getTenNhanVien());
            ps.setDate(2,new Date(obj.getNgaySinh().getTime()));
            ps.setString(3,obj.getGioiTinh());
            ps.setString(4,obj.getDiaChi());
            ps.setString(5,obj.getMaChucVu());
            ps.setString(6,obj.getMaPhong());
            ps.setString(7,obj.getMaHopDong());
            ps.setString(8,obj.getMaToDoi());
            ps.setString(9,obj.getMaNhanVien());
            
            int r = ps.executeUpdate();
            return r>0;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public boolean xoa(String key){
        try {
            Connection conn = db.getConnection();
            
            String query = "DELETE FROM NHANVIEN WHRER MANV=?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1,key);
            int r = ps.executeUpdate();
            return r>0;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

