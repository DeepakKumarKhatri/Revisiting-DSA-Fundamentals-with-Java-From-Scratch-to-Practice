package Foundation;

public class ReverseTheNumber {
    public static void main(String[] args) {
        reverse(754334400);
    }
    public static void reverse(int number){
        while (number>0){
            int ans = number%10;
            System.out.println(ans);
            number = number/10;
        }
    }
}