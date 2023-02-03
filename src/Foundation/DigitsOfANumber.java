package Foundation;

public class DigitsOfANumber {
    public static void main(String[] args) {
        digitsOfANumber(123000);
    }
    public static void digitsOfANumber(int number){
        int count = 0;
        int temp = number;
        while (temp>0){
            temp = temp/10;
            count++;
        }
        int divisor = (int)Math.pow(10,count-1);
        while (divisor>0){
            int digit = number/divisor;
            System.out.println(digit);
            number = number % divisor;
            divisor = divisor/10;
        }
    }
}
