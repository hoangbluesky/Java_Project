/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.models;

import java.sql.Date;

/**
 *
 * @author Dell
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private Date ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String maChucVu;
    private String maPhong;
    private String maHopDong;
    private String maToDoi;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh, String diaChi, String maChucVu, String maPhong, String maHopDong, String maToDoi) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maChucVu = maChucVu;
        this.maPhong = maPhong;
        this.maHopDong = maHopDong;
        this.maToDoi = maToDoi;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getMaHopDong() {
        return maHopDong;
    }

    public String getMaToDoi() {
        return maToDoi;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public void setMaHopDong(String maHopDong) {
        this.maHopDong = maHopDong;
    }

    public void setMaToDoi(String maToDoi) {
        this.maToDoi = maToDoi;
    }
}
