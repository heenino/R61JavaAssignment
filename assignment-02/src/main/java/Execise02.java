import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Locale;

public class Execise02 {
    public static void main(String[] args) {
        //question 1
//        int a =5;
//        System.out.printf("a = %d %n",  a);
////        question 2
//        int b = 100000000;
//        System.out.printf(Locale.US, "b = %,d %n", b);
////        question 3
//        float c = 5.67098f;
//        System.out.printf("c = %5.4f%n", c);
////        question 4
//        String Hoten = new String("Nguyễn văn A");
//        System.out.printf("Tên tôi là %s và tôi đang dính độc ѾѾѾѾѾѾѾ %n" , Hoten);
////        question 5
//        LocalDateTime date = LocalDateTime.now();
//        System.out.printf("%1$td/%1$tm/%1$tY %1$tH:%1$tMp:%1$tSs %n", date);
//        question06();


    }


    public static void question06(){
        Department department1 = new Department();
        Position position1 = new Position();
        Account account1 = new Account(1,"Exp@gmail.com",
                "yyyy","Trần văn A",
                department1,position1,LocalDateTime.now());
        System.out.printf("%s","id");
        System.out.printf("%10s", "Email");
        System.out.printf("%19s", "userName");
        System.out.printf("%15s", "fullName");
        System.out.printf("%20s", "departmentId");
        System.out.printf("%18s %n", "positionId");
        System.out.printf("%d",account1.id);
        System.out.printf("%19s" ,account1.email);
        System.out.printf("%7s", account1.username);
        System.out.printf("%21s", account1.fullName);
        System.out.printf("%7s", account1.department.id);
        System.out.printf("%20s %n", account1.position.id);


    }





}
