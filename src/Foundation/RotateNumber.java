package Foundation;

public class RotateNumber {
    public static void main(String[] args) {
        rotateNumber(51234,2);
    }
    public static void rotateNumber(int number, int numberOfRotations){
        int count = 0;
        int temp = number;
        while (temp>0){
            temp = temp/10;
            count++;
        }

        // For handling large number of rotations
        numberOfRotations = numberOfRotations%count;

        // For handling negative rotations
        if (numberOfRotations<0){
            numberOfRotations = numberOfRotations+count;
        }

        int divisor = 1;
        int multiplexer = 1;
        for (int i = 1; i <= count ; i++) {
            if (i<=numberOfRotations){
                divisor*=10;
            }else {
                multiplexer*=10;
            }
        }
        int digitExtractedFromRotation = number % divisor;
        int remainingDigits = number / divisor;
        int answer = (digitExtractedFromRotation * multiplexer)+remainingDigits;
        System.out.println(answer);
    }
}
