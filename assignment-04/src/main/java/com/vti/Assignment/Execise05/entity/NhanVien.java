package com.vti.Assignment.Execise05.entity;

public class NhanVien extends Canbo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
