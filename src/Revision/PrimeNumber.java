package Revision;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 17;
        bruteForce(number);
        primeFactorization(number);
        printRange(6,24);
    }

    private static void bruteForce(int number) {
        boolean isPrime = true;
        for(int i=2; i<number; i++){
            if (number%i == 0){
                System.out.println("Not Prime Number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime Number");
    }

    private static void primeFactorization(int number) {
        int count = 0;
        for(int i=2; i*i <= number; i++){
            if(number % i == 0){
                count++;
                break;
            }
        }
        if(count == 0) System.out.println("Prime Number");
        else System.out.println("Not Prime Number");
    }

    public static void printRange(int low, int high){
        for(int i=low; i<=high; i++){
            if(helper(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean helper(int number) {
        int count = 0;
        for(int i=2; i*i <= number; i++){
            if(number % i == 0){
                count++;
                break;
            }
        }
        return count == 0;
    }


}
