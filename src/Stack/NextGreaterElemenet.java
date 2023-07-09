package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElemenet {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,8,10,1,2};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }
    public static int[] nextGreaterElement(int[] array){
        int[] myArray = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        myArray[array.length-1] = -1;
        stack.push(array[array.length-1]);

        for (int i = array.length-2; i >=0 ; i--) {
            while (!(stack.isEmpty()) && array[i]>=stack.peek()){
                stack.pop();
            }
            if (stack.isEmpty()){
                myArray[i] = -1;
            }else {
                myArray[i] = array[i];
            }
            stack.push(array[i]);
        }

        return myArray;
    }
}
