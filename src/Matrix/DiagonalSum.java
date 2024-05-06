package Matrix;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(optimizeddiagonalSum(matrix2));
    }

    public static int optimizeddiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+= matrix[i][i];
            if (i != matrix.length-1-i){
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    private static int diagonalSum(int[][] matrix) {

        int sumPrimary = 0;
        int sumSecondary = 0;
        int calculator = matrix[0].length-1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j <=i; j++) {
                if (matrix[i][j] !=0){
                    sumPrimary += matrix[i][j];
                    matrix[i][j] = 0;
                }
            }

            for (int j = i; j <=i ; j++) {
                if (matrix[i][calculator] !=0){
                    sumSecondary += matrix[i][calculator];
                    matrix[i][calculator] = 0;
                }
                calculator--;
            }
        }
        return (sumPrimary+sumSecondary);
    }
}
