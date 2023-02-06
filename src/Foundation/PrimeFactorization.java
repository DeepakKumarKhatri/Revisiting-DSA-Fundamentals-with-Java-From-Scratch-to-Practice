package Foundation;

public class PrimeFactorization {
    public static void main(String[] args) {
        primeFactorization(46);
        System.out.println();
        primeFactorizationOptimized(46);
    }

    // Brute Force ===> O(n)^2
    public static void primeFactorizationOptimized(int number){
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            while ((number % divisor) == 0){
                number = number/divisor;
                System.out.print(divisor + " ");
            }
        }
        if (number!=0){
            System.out.println(number);
        }
    }

    // Brute Force ===> O(n)^2
    public static void primeFactorization(int number){
        for (int divisor = 2; divisor <= number; divisor++) {
            while ((number % divisor) == 0){
                number = number/divisor;
                System.out.print(divisor + " ");
            }
        }
    }
}
