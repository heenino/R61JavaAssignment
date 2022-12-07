package com.vti.entity;

import java.util.Scanner;

public class News implements INews {
    private int Id;
    private String Title, PublishDate, Author, Content;
    private float AverageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content) {
        Id = id;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title = " + Title);
        System.out.println("PublishDate = " + PublishDate);
        System.out.println("Author = " + Author);
        System.out.println("Content = " + Content);
        System.out.println("AverageRate = " + AverageRate);
    }

    @Override
    public float Calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào 3 đánh giá");
        System.out.println("đánh giá 1");
        int Rate1 = scanner.nextInt();
        System.out.println("đánh giá 2");
        int Rate2 = scanner.nextInt();
        System.out.println("đánh giá 3");
        int Rate3 = scanner.nextInt();
        Integer[] Rates = {Rate1, Rate2, Rate3};
        float Total = 0;
        for (Integer rate : Rates) {
            Total = Total + rate;
        }
        AverageRate = Total / Rates.length;
        return AverageRate;
    }
}