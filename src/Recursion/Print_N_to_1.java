package Recursion;

public class Print_N_to_1 {
    public static void main(String[] args) {
        print_n_to_1(5);
        System.out.println();
        print_1_to_n(5);
    }
    public static void print_n_to_1(int n){
        if (n >=1){
            System.out.print(n + " ");
            print_n_to_1(n-1);
        }
        return;
    }

    public static void print_1_to_n(int n){
        if (n >= 1){
            print_1_to_n(n-1);
            System.out.print(n + " ");
        }
        return;
    }
}
