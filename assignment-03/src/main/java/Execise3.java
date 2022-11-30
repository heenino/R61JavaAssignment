public class Execise3 {
    public static void main(String[] args) {
//        question01
        Integer luong = Integer.parseInt("5000");
        System.out.printf(" luong.floatValue() = %0,2f %n", luong.floatValue());
//        question02
        String a = "123467";
        Integer.valueOf(a);
        System.out.println("a = " + (a + 5));
//        question03
        Integer integer = new Integer("1234567");
        int b = integer;
        System.out.println("b = " + (b + 3) );


    }
}
