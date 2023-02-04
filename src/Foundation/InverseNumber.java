package Foundation;

public class InverseNumber {
    public static void main(String[] args) {
        inverseNumber(21453);
    }
    // EXPLANATION
    // Suppose the number is 21453 then start counting from the
    // original position from 3 then 5 then 4 then 1 then 2
    // and also store the number in inverse using the same position wise.
    // Now from this store these numbers in way that there digit becomes their
    // position and their position becomes their digit. So, the final
    // inverse number will be 23154
    public static void inverseNumber(int number){
        int inverseNumber = 0;
        int originalPosition = 1;
        while (number>0){
            int originalDigit = number%10;
            int invertedDigit = originalPosition;
            int invertedPosition = originalDigit;

            inverseNumber = inverseNumber+(int)(invertedDigit * Math.pow(10,invertedPosition-1));

            number = number/10;
            originalPosition++;
        }
        System.out.println(inverseNumber);
    }
}
