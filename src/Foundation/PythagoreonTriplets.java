package Foundation;

public class PythagoreonTriplets {
    public static void main(String[] args) {
        System.out.println(pythagoreonTriplets(5,13,12));
        System.out.println(pythagoreanTripletsOptimized(5,13,12));
    }
    // 2
    // More efficient solution
    public static boolean pythagoreanTripletsOptimized(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int sumOfSquaredLegs = a * a + b * b + c * c - max * max;
        return max * max == sumOfSquaredLegs;
    }

    // 1
    // This is a good way to approach this problem but Math.pow is
    // expensive function so, it should be avoided if possible
    public static boolean pythagoreonTriplets(int a,int b,int c){
        int checkMax = Math.max(a,b);
        int maxIs = Math.max(c,checkMax);

        if (maxIs == a){
            return Math.pow(maxIs,2) == Math.pow(b,2)+Math.pow(c,2);
        }else if (maxIs == b){
            return Math.pow(maxIs,2) == Math.pow(a,2)+Math.pow(c,2);
        }else {
            return Math.pow(maxIs,2) == Math.pow(a,2)+Math.pow(b,2);
        }
    }
}