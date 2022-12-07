package com.vti.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    private Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> DSThiSinh = new ArrayList<>();

    @Override
    public void themThiSinh() {
        System.out.println("mời bạn nhập vào thí sinh :");
        System.out.println("nhập vào SBD:");
        int SBD = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào họ tên :");
        String hoTen = scanner.nextLine();
        System.out.println("nhập vào địa chỉ :");
        String diaChi = scanner.nextLine();
        System.out.println("nhập mức ưu tiên :");
        int uuTien = scanner.nextInt();
        scanner.nextLine();

        System.out.println("nhập vào khối thi :");
        char khoiThi = scanner.next().charAt(0);

        ThiSinh thiSinh = new ThiSinh(SBD, uuTien, hoTen, diaChi, khoiThi);
        DSThiSinh.add(thiSinh);

    }

    @Override
    public void hienThiDSTS() {
        for (ThiSinh DS : DSThiSinh) {
            System.out.println("DS = " + DS);
        }
    }

    @Override
    public void timKiemTheoSBD() {
        System.out.println("nhập vào số báo danh cần tìm");
        int sbd = scanner.nextInt();
        for (ThiSinh DS : DSThiSinh) {
            if (DS.getSbd() == sbd) {
                System.out.println("DS.toString() = " + DS);
            }
        }
    }
}

