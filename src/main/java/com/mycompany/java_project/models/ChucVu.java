/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.models;

/**
 *
 * @author Dell
 */
public class ChucVu {
    private String maChucVu;
    private String tenChucVu;
    private String ghiChu;
    
    
    public ChucVu() {
    }

    public ChucVu(String maChucVu, String tenChucVu, String ghiChu) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.ghiChu = ghiChu;
    }
    public ChucVu(String maChucVu, String tenChucVu) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
