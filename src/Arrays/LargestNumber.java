package Arrays;

public class LargestNumber {
    public static int largestNumber(int[] arr){
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,56,8,9,10};
        System.out.println(largestNumber(arr));
    }
}
