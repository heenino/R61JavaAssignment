package com.vti.entity;

// Class dùng để làm gì?
// 1. Chạy code Java
// 2. Tạo ra một kiểu dữ liệu mới
public class Department {
    // Class gồm 2 phần
    // 1. Thuộc tính: property
   private int id;
   private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 2. Phương thức: method
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
