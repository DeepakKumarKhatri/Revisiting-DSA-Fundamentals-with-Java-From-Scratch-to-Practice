package Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        System.out.println(duplicateBrackets("(a+b)+((c+d))"));
        System.out.println(duplicateBrackets("((a+b)+(c+d))"));
    }
    public static boolean duplicateBrackets(String expression){

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (character == ')'){
                if (stack.peek() == '('){
                    return true;
                }else {
                    while (stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(character);
            }
        }
        return false;
    }
}