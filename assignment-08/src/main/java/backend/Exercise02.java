package backend;

public class Exercise02 {
    public static <T> void print(T a){
        System.out.println(a);
    }
    public static <E> void printArrayGeneric( E[] inputArrayGeneric ) {
        for(E elementGeneric : inputArrayGeneric) {
            System.out.printf("%s ", elementGeneric);
        }
        System.out.println();
    }
}
