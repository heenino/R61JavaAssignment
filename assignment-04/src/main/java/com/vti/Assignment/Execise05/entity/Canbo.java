package com.vti.Assignment.Execise05.entity;

import java.util.Scanner;

public class Canbo {
    String hoTen;
    int tuoi;
    GioiTinh gioiTinh;
    String diaChi;

    @Override
    public boolean equals(Object obj) {
        Canbo canbo1 = (Canbo) obj;
        return canbo1.equals(this.hoTen);
    }

    public Canbo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập họ tên :");
        this.hoTen = scanner.nextLine();
        System.out.println("nhập tuổi :");
        this.tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("%s %n %s","nhập giới tính theo mẫu","1:Nam , 2:Nữ, 3 Khác");
        int gt = 0;
        switch (gt){
            case 1:
                this.gioiTinh = GioiTinh.NAM;
            case 2:
                this.gioiTinh = GioiTinh.NU;
            case 3:
                this.gioiTinh = GioiTinh.KHAC;
        }
        System.out.println("nhập địa chỉ :");
        this.diaChi = scanner.nextLine();
    }

    public Canbo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
