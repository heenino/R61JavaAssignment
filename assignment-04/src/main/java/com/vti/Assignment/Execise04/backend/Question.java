package com.vti.Assignment.Execise04.backend;

import com.vti.Assignment.Execise04.entity.Student;

public class Question {
    static Student student = new Student();
    public static void question01() {
       student.setDiemHocLuc(6.0);
       student.congThemDiem(1.8);
       student.showInfo();
    }
}
