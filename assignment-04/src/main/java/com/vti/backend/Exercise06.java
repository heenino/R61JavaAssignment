package com.vti.backend;

import com.vti.entity.Contact;
import com.vti.entity.VietnamesePhone;

import java.util.Scanner;

public class Exercise06 {
    public static void question06() {
        Scanner scanner = new Scanner(System.in);
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        int a;
        while (true) {
            System.out.println("chào mừng đến với VietNamesePhone ");
            System.out.println("1: thêm mới danh bạ");
            System.out.println("2: xóa danh bạ theo tên");
            System.out.println("3: cập nhập danh bạ theo tên và số điện thoại mới");
            System.out.println("4: tìm kiếm danh bạ");
            a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("nhập tên: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("nhập phone: ");
                    String phone = scanner.nextLine();
                    vietnamesePhone.insertContact(name, phone);
                    break;
                case 2:
                    System.out.println("mời nhập tên danh bạ cần xóa :");
                    scanner.nextLine();
                    String removeName = scanner.nextLine();
                    vietnamesePhone.removeContact(removeName);
                    break;
                case 3:
                    vietnamesePhone.showContact();
                    System.out.println("phía trên là danh bạ bạn muốn update ở vị trí nào ");
                    int index = scanner.nextInt();
                    System.out.println("nhập tên: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    System.out.println("nhập phone mới: ");
                    String newPhone = scanner.nextLine();
                    vietnamesePhone.updateContact(index,newName,newPhone);
                    break;
                case 4:
                    System.out.println("nhập tên cần tìm kiếm :");
                    scanner.nextLine();
                    String Sname = scanner.nextLine();
                    vietnamesePhone.searchContact(Sname);
                    break;
            }
        }
    }
}
