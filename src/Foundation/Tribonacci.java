package Foundation;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
    public static int tribonacci(int number){
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < number; i++) {
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}
