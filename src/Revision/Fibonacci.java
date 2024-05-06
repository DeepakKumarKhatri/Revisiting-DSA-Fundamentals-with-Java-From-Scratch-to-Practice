package Revision;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 1000000000; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
//            a = a + b;
//            b = a - b;
        }
    }
}
