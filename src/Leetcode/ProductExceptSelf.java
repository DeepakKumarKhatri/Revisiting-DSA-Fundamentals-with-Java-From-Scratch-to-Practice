package Leetcode;

import java.util.Arrays;
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int suffix = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = suffix;
            suffix *= nums[i];
        }

        int prefix = 1;
        for (int i = nums.length-1; i >=0 ; i--) {
            answer[i] = answer[i] * prefix;
            prefix *= nums[i];
        }

        return answer;
    }
}
