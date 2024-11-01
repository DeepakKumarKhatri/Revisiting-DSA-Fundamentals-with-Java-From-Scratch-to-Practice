package Leetcode;
public class GCDStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }else{
            return str1.substring(0,gcd(str1.length(),str2.length()));
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}
