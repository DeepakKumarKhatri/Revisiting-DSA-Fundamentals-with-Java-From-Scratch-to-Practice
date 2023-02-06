package Foundation;

public class GCDandLCM {
    public static void main(String[] args) {
        GCDandLCM(36,24);
    }
    // GCD ==> Greatest Common Divisor
    // LCM ==> Lowest common multiple (A lowest number which comes in the table of both the numbers)
    public static void GCDandLCM(int num1,int num2){
        int originalNumber1 = num1;
        int originalNumber2 = num2;
        int reminder = 0;
        while ((num1%num2)!=0){
            reminder = num1%num2;
            num1 = num2;
            num2 = reminder;
        }
        int gcd = reminder;
        System.out.println(gcd);

        int lcm = (originalNumber1 * originalNumber2)/gcd;
        System.out.println(lcm);

    }
}
