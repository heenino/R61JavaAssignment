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
            String up = (a.toUpperCase());
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

    public static void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào họ của bạn :");
        String ho = scanner.nextLine();
        System.out.println("nhập vào tên của bạn :");
        String ten = scanner.nextLine();
        String hoten = (ho + " ").concat(ten); // nối chuỗi họ và tên
        String[] hotens = hoten.split("\\s"); // tách chuỗi dựa trên khoảng trắng
        System.out.println("họ là :" + hotens[0]);
        System.out.println("tên đệm là :" + hotens[1]);
        System.out.println("tên là :" + hotens[2]);
    }

    public static void question07() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(); //tạo 1 lớp Stringbuilder để thao tác các AI
        System.out.println("nhập vào họ và tên của bạn :");
        String hoVaTen = scanner.nextLine();
        System.out.println("họ và tên sau khi bỏ khoảng cách dư thừa :" + hoVaTen.trim());
        String[] hoVatens = hoVaTen.trim().split("\\s");
        for (String hoten : hoVatens) {
            char[] charracter = hoten.toCharArray();  // tạo 1 mảng char để gán kí tự vào (sau khi đã tách chuỗi);
            charracter[0] = Character.toUpperCase(charracter[0]);
            stringBuilder.append(new String(charracter));
            stringBuilder.append(" ");
        }
        System.out.println("họ và tên của bạn sau khi chuẩn hóa là :" + stringBuilder);

    }

    public static void question08() {
        class Group {
            int id;
            String name;
        }
        Group[] groups = new Group[10];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new Group();
            if (groups[i].name.contains("Java")) {
                System.out.println("groups[i] = " + groups[i]);
            }
        }
    }

    public static void question09() {
        class Group {
            int id;
            String name;
        }
        Group[] groups = new Group[10];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new Group();
            if (groups[i].name.equals("Java")) {
                System.out.println("groups[i] = " + groups[i]);
            }
        }
    }

    public static void question10() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("nhập chuỗi 1 :");
        String a = scanner.nextLine();
        System.out.println("nhập chuỗi 2");
        String b = scanner.nextLine();
        if (stringBuilder.append(a).reverse().toString().equals(b)) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    public static void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ngẫu nhiên :");
        String a = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                dem++;
            }
        }
        System.out.println("số chữ a có trong chuỗi là :" + dem);
    }

    public static void question13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ngẫu nhiên :");
        String a = scanner.nextLine();
        System.out.println(!a.matches(".*[0-9].*"));
    }

    public static void question15() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(); //tạo 1 lớp Stringbuilder để thao tác các AI
        System.out.println("nhập vào 1 chuỗi");
        String a = scanner.nextLine();
        String[] str = a.trim().split("\\s");
        System.out.println("trước khi đảo ngược :");
        for (String strs : str) {
            System.out.print(strs + " ");
        }
        System.out.println();
        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            String tam = str[i];
            str[i] = str[j];
            str[j] = tam;
        }
        System.out.println("sau khi đảo ngược :");
        for (String strs : str) {
            System.out.print(strs+ " ");
        }
    }


    public static void main(String[] args) {
//        question01();
//        question02();
//        question03();
//        question04();
//        question05();
//        question06();
//        question07();
//        question08();
//        question09();
//        question10();
//        question11();
//        question13();
//        question15();
    }
}
