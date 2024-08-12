import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

    public class Interleave_queue9 {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i <= 10; i++) {
                queue.add(i);
            }

            System.out.println("Original queue: " + queue);
            interleaveQueue(queue);
            System.out.println("Interleaved queue: " + queue);
        }

        public static void interleaveQueue(Queue<Integer> queue) {
            if (queue.isEmpty()) {
                return;
            }

            int size = queue.size();
            int halfSize = size / 2;
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < halfSize; i++) {
                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }

            for (int i = 0; i < halfSize; i++) {
                queue.add(queue.poll());
            }

            for (int i = 0; i < halfSize; i++) {
                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
                queue.add(queue.poll());
            }
        }
}
