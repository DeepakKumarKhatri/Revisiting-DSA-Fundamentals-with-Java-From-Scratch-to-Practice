package Stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("[(a+b)+{(c+d)*(e/f)}]"));
        System.out.println(isBalanced("[(a+b)+{(c+d)*(e/f)]}"));
        System.out.println(isBalanced("[{c+d}])"));
    }
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']'){
                if (!stack.isEmpty()){
                    if (stack.peek() == '(' && ch == ')'){
                        stack.pop();
                    }else if (stack.peek() == '{' && ch == '}'){
                        stack.pop();
                    }else if (stack.peek() == '[' && ch == ']'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }else if  (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}