import java.util.Stack;

public class QueueUsingStacks<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(T item) {
        stack1.push(item);
    }

    // Dequeue operation
    public T dequeue() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 to reverse their order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }

    // Peek operation to get the front element
    public T peek() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2 to reverse their order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front of the queue: " + queue.peek()); // Output: 1

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 2

        System.out.println("Front of the queue: " + queue.peek()); // Output: 3
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
    }
}