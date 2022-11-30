import java.util.Arrays;
import java.util.Scanner;

public class Execise4 {
    public static void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 chuỗi kí tự : ");
        String a = scanner.nextLine();
        System.out.printf(" số kí tự là %d", a.length());
    }

    public static void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập 1 chuỗi kí tự : ");
        String a = scanner.nextLine();
        System.out.println("nhập 1 chuỗi kí tự : ");
        String b = scanner.nextLine();
        System.out.printf("nối 2 chuỗi thành : %s", a.concat(b));

    }

    public static void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên của bạn :");
        do {
            String a = scanner.nextLine();
            String c = String.valueOf(a.charAt(0));
            if (c.equals(c.toUpperCase())) {
                System.out.println("tên của bạn là :");
                break;
            } else {
                System.out.println("nhập lại (chữ cái đầu viết hoa) ");
            }
        } while (true);
    }

    public static void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào tên của bạn :");
        String a = scanner.nextLine();
        for (int i = 0; i < a.length(); i++) {
            String up = String.valueOf(a.toUpperCase());
            System.out.println("kí tự thứ " + (i + 1) + " là: " + up.charAt(i));
        }

    }
    public static void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào họ của bạn :");
        String ho = scanner.nextLine();
        System.out.println("nhập vào tên của bạn :");
        String ten = scanner.nextLine();
        String hoten = (ho + " ").concat(ten); // nối chuỗi họ và tên
        String[] hotens = hoten.split("\\s"); // tách chuỗi dựa trên khoảng trắng
        for (String a : hotens) {
            System.out.print(a + " ");
        }
    }
    public static void question06(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào họ của bạn :");
        String ho = scanner.nextLine();
        System.out.println("nhập vào tên của bạn :");
        String ten = scanner.nextLine();
        String hoten = (ho + " ").concat(ten); // nối chuỗi họ và tên
        String[] hotens = hoten.split("\\s"); // tách chuỗi dựa trên khoảng trắng
        System.out.println("họ là :" + hotens[0]);
        System.out.println("tên đệm là :"+ hotens[1]);
        System.out.println("tên là :" + hotens[2]);
    }







    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
//        question05();
        question06();

    }
}
