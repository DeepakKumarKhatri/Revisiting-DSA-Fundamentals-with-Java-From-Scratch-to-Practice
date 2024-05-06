package Revision;

public class DigitsOfNumber {
    public static void main(String[] args) {
        int number = 1000;
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        while (count > 0) {
            int digit = number / (int) Math.pow(10, count-1);
            System.out.println(digit);
            number %= (int) Math.pow(10, count-1);
            count--;
        }
    }
}
