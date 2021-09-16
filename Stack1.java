import java.util.Stack;

public class Stack1 {
    public static void main(String[] args)
    {
        Stack<Integer> stk = new Stack<>();
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(15);
        stk.push(16);

        System.out.println(stk);
        System.out.println("Top Position "+stk.peek());
        System.out.println("change the position "+stk.set(3,5));
        System.out.println(stk);
        System.out.println("Poped the element "+stk.pop());
        System.out.println(stk);

    }
}
