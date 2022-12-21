package frontend;

import backend.Exercise01;
import backend.Exercise02;
import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {

//        Exercise01.question01a();
//        Exercise01.question01b();
//        Exercise01.question01c();
//        Exercise01.question01e();
//        Exercise01.question01f();
//        Exercise01.question01d();
//        Exercise01.question01g();
//        Exercise01.question01h();
//        Exercise01.question01i();
//        Exercise01.question01k();
//        Exercise01.question01l();
//        Exercise01.question01j();

        Student01<Integer> student01 = new Student01<>(1, "a");
        Student01<Float> student011 = new Student01<>(1.2f, "B");
        Student01<Double> student012 = new Student01<>(1.02d, "C");




//        question01
//        Exercise02.print(student011);



//question 03

//        tạo các array để in bằng method generic
        Integer[] intArrayGeneric = { 2,4,6,8,10 };
        Float[] floatArrayGeneric = {1.2f,3.4f, 6.7f};
//        Long[] longArrayGeneric = {999999999999999L, 3213213213123232123L,3821983712897312L};
        Double[] doubleArrayGeneric = { 2.1, 3.2, 4.3, 5.4 };
//        Character[] charArrayGeneric = { 'L', 'E', 'V', 'U', 'O' };
//
//
//        System.out.println("in Array int");
//        Exercise02.printArrayGeneric(intArrayGeneric);
//        System.out.println("in Array float");
//        Exercise02.printArrayGeneric(floatArrayGeneric);
//        System.out.println("in Array long");
//        Exercise02.printArrayGeneric(longArrayGeneric);
//        System.out.println("in Array double");
//        Exercise02.printArrayGeneric(doubleArrayGeneric);
//        System.out.println("in Array char");
//        Exercise02.printArrayGeneric(charArrayGeneric);

//question05demo Generrics
        Employee<Integer> employee = new Employee<>(1,"Hùng",intArrayGeneric);
        System.out.println("thông tin employee");
        System.out.println("employee = " + employee);
        System.out.println("thông tin tháng lương cuối cùng của employee");
        employee.lastOfsalaries();

        Employee<Float> employee01 = new Employee<>(2,"Hùng",floatArrayGeneric);
        System.out.println("thông tin employee");
        System.out.println("employee = " + employee01);
        System.out.println("thông tin tháng lương cuối cùng của employee");
        employee01.lastOfsalaries();

        Employee<Double> employee02 = new Employee<>(3,"Hùng",doubleArrayGeneric);
        System.out.println("thông tin employee");
        System.out.println("employee = " + employee02);
        System.out.println("thông tin tháng lương cuối cùng của employee");
        employee02.lastOfsalaries();



//        question06demo Generics
        Student02 student = new Student02(1,"Quỳnh");


//        question07demo
        Phone phone = new Phone("hee@gmail.com", 9811);
        Phone phone01 = new Phone("11", 9811);
        Phone phone02 = new Phone("Trần Phi Hùng", 9811);




    }

}

