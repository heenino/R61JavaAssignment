package com.vti.Assignment.Execise05.entity;

public class CongNhan extends Canbo  {
    private int bac;

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }
}
