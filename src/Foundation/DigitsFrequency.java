package Foundation;

public class DigitsFrequency {
    public static void main(String[] args) {
        System.out.println(digitsFrequency(50000,0));
    }
    public static int digitsFrequency(int number, int digit){
        int sum = 0;
        while (number>0){
            if (digit == (number % 10)){
                sum++;
            }
            number = number/10;
        }
        return sum;
    }
}
