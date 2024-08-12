import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    public void pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int poppedValue = stack.pop();

        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }
    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.peek();
    }
    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        System.out.println("Min: " + minStack.getMin()); // Output: Min: 3
        minStack.push(2);
        minStack.push(1);
        System.out.println("Min: " + minStack.getMin()); // Output: Min: 1
        minStack.pop();
        System.out.println("Top: " + minStack.top());    // Output: Top: 2
        System.out.println("Min: " + minStack.getMin()); // Output: Min: 2
    }
}