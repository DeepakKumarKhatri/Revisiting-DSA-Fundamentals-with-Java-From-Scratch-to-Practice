// Leetcode - https://leetcode.com/problems/reverse-vowels-of-a-string/
package Leetcode;

class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int li = 0;
        int ri = arr.length-1;

        while (li<ri){
            if (isVowel(arr[li]) && isVowel(arr[ri])){
                char temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            } else if (isVowel(arr[li])) {
                ri--;
            } else if (isVowel(arr[ri])) {
                li++;
            } else {
                li++;
                ri--;
            }
        }
        return new String(arr);
    }
    public static boolean isVowel(char character){
        return (character == 'a' || character == 'A')
                || (character == 'e' || character == 'E')
                || (character == 'i' || character == 'I')
                || (character == 'o' || character == 'O')
                || (character == 'u' || character == 'U');
    }
}
