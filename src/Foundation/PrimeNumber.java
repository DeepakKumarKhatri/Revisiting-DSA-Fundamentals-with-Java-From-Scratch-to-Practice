package Foundation;

public class PrimeNumber {
    public static void main(String[] args) {
        //3
        printPrimeInRange(5,15);
        // 2
        System.out.println(checkPrimeByFactorization(10));
        // 1
        System.out.println(checkPrimes(10));
    }

    // 3
    public static void printPrimeInRange(int low, int high){
        for (int number = low; number <=high ; number++) {
            int count = 0;

            // Now divide the number and increase count to check prime
            for (int divisor = 2; divisor*divisor <=number ; divisor++) {
                if ((number%divisor)==0){
                    count++;
                    break;
                }
            }
            // Now divide the number and increase count to check prime

            if (count == 0){
                System.out.println(number);
            }
        }
    }

    // 2
    // PRIME FACTORIZATION ==> T(sqr(n))
    // This method ensures that the number is divisible until it's
    // square root and after that it repeats itself so, we have to check
    // only in that range only instead of going for all numbers
    public static boolean checkPrimeByFactorization(int number){
        int count = 0;
        // Don't need to start from 1 because we already know it is always true
        for (int i = 2; i*i <= number ; i++) {
            if ((number%i) == 0){
                count++;
                // Break is used because if any number found to be divisible
                // then simply it's non-prime then don't need to check further
                break;
            }
        }
        // If in the if-statement count>0 then it means that there's number that is
        // divisible by the number than simply that number is not prime
        return count == 0;
    }

    // 1
    // BRUTE FORCE APPROACH
    // Time ==> 0(n)
    public static boolean checkPrimes(int n) {
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            if ((n%i) == 0){
                count++;
            }
        }
        return count == 2;
    }
}