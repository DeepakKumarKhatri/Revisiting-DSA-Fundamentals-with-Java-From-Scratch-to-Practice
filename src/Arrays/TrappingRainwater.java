package Arrays;

// Leetcode Hard
//https://leetcode.com/problems/trapping-rain-water/description/

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water Amount Is: "+ trappingRainwater(height));
    }

    private static int trappingRainwater(int[] height) {
//        Create two auxiliary arrays for left and right max of each bar
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        rightMax[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater+= waterLevel-height[i];
        }

        return trappedWater;
    }
}
