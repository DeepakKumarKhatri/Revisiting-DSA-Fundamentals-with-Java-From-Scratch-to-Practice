package Leetcode;

public class StringCompression {
    public static void main(String[] args) {
        char[] nums = {'a','a','b','b','c','c','c'};
        System.out.println(compress(nums));
    }
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();

        if (chars.length >= 1){
            sb.append(chars[0]);
        }
        int count = 1;
        int io = 1;
        while (io < chars.length){
            if (chars[io] == chars[io-1]){
                count++;
            }else {
                if (count > 1){
                    sb.append(count);
                }
                sb.append(chars[io]);
                count = 1;
            }
            io++;
        }
        if (count > 1){
            sb.append(count);
        }

        int i = 0;
        while (i < sb.length()){
            chars[i] = sb.toString().charAt(i);
            i++;
        }

        return sb.length();
    }
}
