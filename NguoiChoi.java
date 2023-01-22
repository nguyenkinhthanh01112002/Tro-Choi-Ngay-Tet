/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taixiuonline;

/**
 *
 * @author KINHTHANH
 */
public class NguoiChoi {
    private String ten;
    private String soTaiKhoan;
    private int soTienKhaDung;

    public NguoiChoi(String ten, String soTaiKhoan, int soTienKhaDung) {
        this.ten = ten;
        this.soTaiKhoan = soTaiKhoan;
        this.soTienKhaDung = soTienKhaDung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public int getSoTienKhaDung() {
        return soTienKhaDung;
    }

    public void setSoTienKhaDung(int soTienKhaDung) {
        this.soTienKhaDung = soTienKhaDung;
    }

    @Override
    public String toString() {
        return "CHU TAI KHOAN: "+ten+"/n"+"SO DU KHA DUNG: "+soTienKhaDung;
    }

    
    
}
