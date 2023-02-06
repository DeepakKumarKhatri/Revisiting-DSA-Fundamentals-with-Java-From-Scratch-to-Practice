package Foundation;

public class BenjaminBulbs {
    public static void main(String[] args) {
        benjaminBulbs(10);
    }
    public static void benjaminBulbs(int number){
        for (int i = 1; i * i <=number ; i++) {
            System.out.print(i * i + " ");
        }
    }
}
