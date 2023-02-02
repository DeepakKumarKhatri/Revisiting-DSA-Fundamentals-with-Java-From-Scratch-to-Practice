package Foundation;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(countDigitsInNumber(934562));
    }
    public static int countDigitsInNumber(int number){
        int count = 0;
        while (number>0){
            number = number/10;
            count++;
        }
        return count;
    }
}
