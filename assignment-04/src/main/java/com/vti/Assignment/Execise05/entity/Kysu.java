package com.vti.Assignment.Execise05.entity;

public class Kysu extends Canbo{
   private String nganhDaoTao;

    public Kysu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
