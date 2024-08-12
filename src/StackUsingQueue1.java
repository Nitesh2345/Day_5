import java.util.LinkedList;
import java.util.Queue;

    public class StackUsingQueue1{
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public StackUsingQueue1() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }
        public void push(int x) {
            queue1.add(x);
        }
        public int pop() {
            if (queue1.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
            int top = queue1.remove();

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return top;
        }

        public int top() {
            if (queue1.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }

            int top = queue1.remove();
            queue2.add(top);

            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;

            return top;
        }

        public boolean isEmpty() {
            return queue1.isEmpty();
        }

        public static void main(String[] args) {
            StackUsingQueue1 stack = new StackUsingQueue1();
            stack.push(1);
            stack.push(2);
            stack.push(3);

            System.out.println(stack.top());
            System.out.println(stack.pop());
            System.out.println(stack.top());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
            System.out.println(stack.pop());
            System.out.println(stack.isEmpty());
        }
    }
