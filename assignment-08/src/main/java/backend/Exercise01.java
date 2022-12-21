package backend;

import entity.Student;
import ultis.ScannerUtils;

import java.util.*;

public class Exercise01 {
    static List<Student> studentList = new ArrayList<>();

    public static void question01a() {
        studentList.add(new Student("Nam"));
        studentList.add(new Student("Nam"));
        studentList.add(new Student("Nam"));
        studentList.add(new Student("Duy"));
        studentList.add(new Student("Huy"));
        System.out.println("studentList.size() = " + studentList.size());
    }

    public static void question01b() {
        System.out.println("phần tử thứ 4" + studentList.get(3));
    }

    public static void question01c() {
        System.out.println("học sinh đầu tiên " + studentList.get(0));
        System.out.println("học sinh cuối cùng " + studentList.get(studentList.size() - 1));
    }

    public static void question01e() {
        studentList.add(0, new Student("Tuấn"));
    }

    public static void question01f() {
        studentList.add(new Student("Doanh"));
    }

    public static void question01d() {
        System.out.println("list students trước khi đảo ngược");
        for (Student student : studentList) {
            System.out.println(student);
        }
//                     Đảo ngược vị trí của students bằng API collections reverse
        Collections.reverse(studentList);
        Iterator<Student> studentIterator = studentList.iterator();

        System.out.println("list students sau khi đảo ngược");
        while (studentIterator.hasNext()) {
            Object element = studentIterator.next();
            System.out.println(element);
        }
    }

    public static void question01g() {
        System.out.println("nhập id của student muốn tìm kiếm");
        int id = ScannerUtils.inputInt("nhập lại");
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println("student = " + student);
            }
        }
    }

    public static void question01h() {
        System.out.println("nhập name của student muốn tìm kiếm");
        String name = ScannerUtils.inputString("nhập lại");
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                System.out.println("student = " + student);
            }
        }
    }

    public static void question01i() {
//                sử dụng vòng lặp và 1 biến đếm để tìm tên giống nhau
        for (int i = 0; i < studentList.size(); i++) {
            int count = 0;
            for (Student student : studentList) {
//                nếu giá tên của student vòng lặp ngoài giống với vòng tên của student ở vòng lặp trong
//                thì biến đếm thêm 1 giá trị.
                if (studentList.get(i).getName().equals(student.getName())) {
                    count++;
                }
            }
//                 biến đếm có trên 1, tức là nhiều giá trị giống nhau thì in ra student đó
            if (count > 1) {
                System.out.println(studentList.get(i));
            }
        }
    }


    public static void question01k() {
//                  xóa name của student có id = 2
        for (Student student : studentList) {
            if (student.getId() == 2) {
                student.setName(null);
                System.out.println("student = " + student);
            }
        }
    }

    public static void question01l() {
        System.out.println("truoc khi xoa");
        for (Student student : studentList) {
            System.out.println(student);
        }


        Student studentToDelete = null;
        for (Student student : studentList) {
            if (student.getId() == 5) {
//                gán student có id = 5 cho biến studentToDelete
                studentToDelete = student;
                break;
            }
        }
//                 nếu tìm được học sinh cần xóa thì dùng api remove của list
        if (studentToDelete != null) {
            studentList.remove(studentToDelete);
        }

        System.out.println("sau khi xoa");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    public static void question01j(){
        ArrayList<Student> students = new ArrayList<>(studentList);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}






