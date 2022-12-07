package com.vti.Assignment.Execise04.entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String homeTown;
    private double diemHocLuc;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id :");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập name :");
        this.name = scanner.nextLine();
        System.out.println("nhập homeTown :");
        this.homeTown = scanner.nextLine();
        this.diemHocLuc = 0;
    }

    public void setDiemHocLuc(double diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }

    public void congThemDiem(double diemCong) {
        this.diemHocLuc = diemHocLuc + diemCong;
    }

    public void showInfo() {
        String hocLuc;
        if (diemHocLuc < 4) {
            hocLuc = "yếu";
        } else if (diemHocLuc < 6) {
            hocLuc = "trung bình";
        } else if (diemHocLuc < 8) {
            hocLuc = "khá";
        } else {
            hocLuc = "giỏi";
        }
        System.out.printf(" %s - %s.%n", name, hocLuc);
    }
}
