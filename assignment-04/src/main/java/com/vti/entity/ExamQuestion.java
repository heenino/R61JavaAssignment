package com.vti.entity;

public class ExamQuestion {
    Exam exam;
    Question question;

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "exam=" + exam.getCode() +
                ", question=" + question.getContent() +
                '}';
    }
}
