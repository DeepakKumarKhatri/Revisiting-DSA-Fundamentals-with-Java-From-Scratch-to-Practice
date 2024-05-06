package Revision;

public class CountDigits {
    public static void main(String[] args) {
        int number = 9543;
        int count = 0;
        while (number > 0){
            count++;
            number /= 10;
        }
        System.out.println(count);
    }
}
