package Stack;

import java.util.ArrayList;

public class CustomStack {

    private ArrayList<Integer> list = new ArrayList<>();
    private int index = -1;

    public void push(int element){
        index++;
        list.add(index,element);
    }
    public int peek(){
        return list.get(index);
    }
    public int pop(){
        if (list.isEmpty()){
            System.out.print("Stack Is Empty that why we returned: ");
            return -1;
        }
        int popped = list.get(index);
        list.remove(index);
        index--;
        return popped;
    }
    public int size(){
        return list.size();
    }
}
class Main{
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);
        customStack.push(50);
        System.out.println(customStack.size());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.size());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.size());
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }
}
