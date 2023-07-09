package Arrays;

// Asked in MAANG
// https://leetcode.com/problems/maximum-subarray/
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int[] specialCase = {-1,-2,-3,-4};
        System.out.println("Maximum Sum Is: " + maxSumSubArray(specialCase));
        System.out.println("Maximum Sum Is: " + prefixSubArraySum(specialCase));
        System.out.println("Maximum Sum Is: " + kadaneSubArraySum(specialCase));
    }

    // Pass the huge input ===> 0(n)
    private static int kadaneSubArraySum(int[] arr) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max( arr[i], currentSum+arr[i] );
            maximumSum = Math.max( maximumSum, currentSum );
        }
        return maximumSum;
    }

    // Fails at huge input ===> 0(n^2)
    private static int prefixSubArraySum(int[] arr){
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if (i == 0) currentSum = prefixSum[j];
                else currentSum = prefixSum[j] - prefixSum[i - 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    // Fails at huge input ===> 0(n^3)
    private static int maxSumSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currentSum+=arr[k];
                }
                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
