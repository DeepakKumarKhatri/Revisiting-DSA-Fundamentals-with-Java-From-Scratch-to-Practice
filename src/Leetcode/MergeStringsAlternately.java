package Leetcode;

// Leetcode - https://leetcode.com/problems/merge-strings-alternately/
public class MergeStringsAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        int j = 0;
        boolean flag = true;

        while ((i<word1.length()) && (j<word2.length())){
            if (flag){
                stringBuilder.append(word1.charAt(i));
                i++;
            }else{
                stringBuilder.append(word2.charAt(j));
                j++;
            }
            flag = !flag;
        }
        while ((i<word1.length())){
            stringBuilder.append(word1.charAt(i));
            i++;
        }
        while ((j<word2.length())){
            stringBuilder.append(word2.charAt(j));
            j++;
        }
        return stringBuilder.toString();
    }
}
