package Arrays;

public class BarChart {
    public static void main(String[] args) {
        int[] arr = {5,8,12,8,5};
        barChart(arr);
        //Expected Output
//           	    *
//                  *
//                  *
//                  *
//             *	*	*
//             *	*	*
//             *	*	*
//         *	*	*	*	*
//         *	*	*	*	*
//         *	*	*	*	*
//         *	*	*	*	*
//         *	*	*	*	*

    }
    public static void barChart(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }

        for (int floor = max; floor >=1 ; floor--) {
            for (int building = 0; building < array.length; building++) {
                if (array[building]>=floor){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
