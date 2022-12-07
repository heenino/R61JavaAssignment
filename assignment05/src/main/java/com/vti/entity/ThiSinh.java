package com.vti.entity;

public class ThiSinh {
    private int sbd, mucUuTien;
    private String hoTen, diaChi;
    private char khoiThi;

    public int getSbd() {
        return sbd;
    }

    public ThiSinh() {
    }

    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    public ThiSinh(int sbd, int mucUuTien, String hoTen, String diaChi, char khoiThi) {
        this.sbd = sbd;
        this.mucUuTien = mucUuTien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.khoiThi = khoiThi;
    }

    public char getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(char khoiThi) {
        this.khoiThi = khoiThi;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public int getMucUuTien() {
        return mucUuTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "sbc=" + sbd +
                ", mucUuTien=" + mucUuTien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", khoiThi=" + khoiThi +
                '}';
    }
}
