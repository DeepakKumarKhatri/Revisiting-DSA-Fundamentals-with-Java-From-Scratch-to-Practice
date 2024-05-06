package Foundation;

import java.util.Arrays;

public class SideRun {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int left = 0,count = 0,result = 0;
        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))){
                count++;
            }
            if (right-left+1 > k){
                if (isVowel(s.charAt(left))){
                    count--;
                }
                left+=1;
            }
            result = Math.max(count,result);
        }
        return result;
    }

    private static boolean isVowel(char charAt) {
        return charAt == 'a' || charAt == 'e' ||
                charAt == 'i' || charAt == 'o' ||
                charAt == 'u';
    }

}
