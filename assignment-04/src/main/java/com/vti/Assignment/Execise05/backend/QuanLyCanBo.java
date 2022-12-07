package com.vti.Assignment.Execise05.backend;

import com.vti.Assignment.Execise05.entity.Canbo;

import java.util.Scanner;

public class QuanLyCanBo {
    public static void quanLyCanBo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Thêm mới cán bộ ");
        System.out.println("2: tìm kiếm cán bộ theo họ tên ");
        System.out.println("danh sách các cán bộ");
        int qlcb = scanner.nextInt();
        scanner.nextLine();
        switch (qlcb) {
            case 1:
                Canbo canbo = new Canbo();
                break;
            case 2:
                System.out.println("nhập họ tên cán bộ muốn tìm :");
                String hoTen = scanner.nextLine();

        }
        scanner.close();
    }

}

