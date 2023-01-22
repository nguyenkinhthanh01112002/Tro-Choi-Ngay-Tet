/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taixiuonline;

import java.util.ArrayList;

/**
 *
 * @author KINHTHANH
 */
public class QuyTacChoi {
    private ArrayList<NguoiChoi> members;

    public QuyTacChoi() {
        this.members = new ArrayList<>();
    }
    public void themThanhVien(NguoiChoi nguoiChoi)
    {
        this.members.add(nguoiChoi);
    }
    public void congTien(int soTienCuoc)
    {
        int tongTien = this.members.get(0).getSoTienKhaDung()+soTienCuoc;
        this.members.get(0).setSoTienKhaDung(tongTien);
    }
    public void congTienBoDoiDongNhat(int soTienCuoc)
    {
        int tongTien = this.members.get(0).getSoTienKhaDung()+soTienCuoc*11;
        this.members.get(0).setSoTienKhaDung(tongTien);
    }
    
    
    
}
