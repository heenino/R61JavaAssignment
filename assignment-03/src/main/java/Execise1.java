import java.awt.geom.Ellipse2D;
import java.util.Random;
import java.util.Scanner;

public class Execise1 {
    public static void question02() {
        Random random = new Random();
        int n = random.nextInt(99999 + 1);
        if (n >= 1000 && n <= 9999) {
            String a = "0" + n;
            System.out.println("n = " + a);
        } else if (n >= 100 && n <= 999) {
            String b = "00" + n;
            System.out.println("n = " + b);
        } else if (n >= 10 && n <= 99) {
            String c = "000" + n;
            System.out.println("n = " + c);
        } else if (n >= 0 && n <= 9) {
            String d = "0000" + n;
            System.out.println("n = " + d);
        } else {
            System.out.println("n = " + n);
        }

    }
    public static void question03(){
        Random random = new Random();
        int n = random.nextInt(99999 + 1);
        String s = String.valueOf(n);
        System.out.println("n = " + n);
        System.out.println("2 số cuối của chuỗi Random n : " + s.charAt(s.length() -2) + s.charAt(s.length() - 1));
    }
public static void question04(){
        Scanner scanner = new Scanner(System.in);
    System.out.println("\"nhập a\" = ");
    int a = scanner.nextInt();
    scanner.nextLine();
    System.out.println("\"nhập b\" = ");
    do {
        int b = scanner.nextInt();
        scanner.nextLine();
        if (b != 0){
            System.out.println("thương của a chia b :"+ ((float) a / b));
            return;
        }else {
            System.out.println("nhập lại b(b khác 0) :");
            continue;
        }
    }while (true);


}


    public static void main(String[] args) {

//    quesstion01
//        float luongAcc1 = 5240.5f;
//        float luongAcc2 = 10970.055f;
//
//        int luong1 = (int) luongAcc1;
//        int luong2 = (int) luongAcc2;
//        System.out.println("luong1 = " + luong1);
//        System.out.println("luong2 = " + luong2);
//
//        question02();
//        question03();
//        question04();


    }
}
