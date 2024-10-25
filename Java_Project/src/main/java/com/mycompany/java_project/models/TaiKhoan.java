/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project.models;

/**
 *
 * @author Dell
 */
public class TaiKhoan {
    private String soDT;
    private String tenDangNHap;
    private String passWord;

    public TaiKhoan() {
    }
    
    public TaiKhoan(String soDT, String tenDangNHap, String passWord) {
        this.soDT = soDT;
        this.tenDangNHap = tenDangNHap;
        this.passWord = passWord;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getTenDangNHap() {
        return tenDangNHap;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setTenDangNHap(String tenDangNHap) {
        this.tenDangNHap = tenDangNHap;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
}
