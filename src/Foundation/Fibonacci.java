package Foundation;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciTillN(10);
    }
    public static void fibonacciTillN(int number){
        int a = 0;
        int b = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
