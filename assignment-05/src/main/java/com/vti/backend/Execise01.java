package com.vti.backend;

import com.vti.entity.News;
import com.vti.entity.ThiSinh;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Execise01 {
    public static Scanner scanner = new Scanner(System.in);
    public static List<News> NewsList = new ArrayList<>();

    public static void question01() {
        int chose;
        News news = new News();
        while (true) {
            System.out.println("1: Insert news");
            System.out.println("2: View list news");
            System.out.println("3: Average rate");
            System.out.println("4: Exit");
            chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("nhập Title: ");
                    scanner.nextLine();
                    news.setTitle(scanner.nextLine());
                    System.out.println("nhập PublishDate: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.println("nhập Author: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.println("nhập content: ");
                    news.setContent(scanner.nextLine());
                    news.Calculate();
                    NewsList.add(news);
                    break;
                case 2:
                    for (News list : NewsList) {
                        list.Display();
                        System.out.println();
                    }
                    break;
                case 3:
                    news.Calculate();
                    NewsList.add(news);
                    for (News list : NewsList) {
                        list.Display();
                        System.out.println();
                    }
                    break;
                case 4:
                    return;

            }

        }
    }


    public static void question02() {
        Scanner scanner = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh();
        System.out.println("1. Thêm mới thí sinh");
        System.out.println("2. Hiển thị danh sách thí sinh");
        System.out.println("3. Tìm kiếm theo số báo danh");
        System.out.println("4. Thoát chương trình");
        System.out.println("Vui lòng chọn chức năng:");
    }

}
