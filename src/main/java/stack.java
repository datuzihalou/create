import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        while (!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
