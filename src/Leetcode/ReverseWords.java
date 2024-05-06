package Leetcode;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello  world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");

        StringBuilder str = new StringBuilder();

        for (int i = words.length-1; i >=0; i--) {
            if (!words[i].trim().isEmpty()) {
                str.append(words[i]);
                str.append(" ");
            }
        }
        return str.toString().trim();
    }
}
