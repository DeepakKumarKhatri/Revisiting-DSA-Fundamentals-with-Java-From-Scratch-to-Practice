package Leetcode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int totalPlacedFlowers = 0;
        int firstOne = -1;
        int lastOne = -1;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0){
                continue;
            } else if (firstOne == -1) {
                firstOne = i;
                lastOne = i;
            }else{
                lastOne = i;
            }
        }

        if (firstOne == -1){
            return n<=(flowerbed.length+1)/2;
        }

        totalPlacedFlowers = (firstOne)/2;
        totalPlacedFlowers += ((flowerbed.length - lastOne) - 1)/2;
        int count = 0;
        for (int i = firstOne+1; i <= lastOne-1; i++) {
            if (flowerbed[i] == 0){
                count++;
            }else{
                totalPlacedFlowers+=(count-1)/2;
                count = 0;
            }
        }
        return n<=totalPlacedFlowers;
    }
}
