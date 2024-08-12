
import java.util.NoSuchElementException;

    public class Circular_Queue2{
        private int[] data;
        private int head;
        private int tail;
        private int size;
        private int capacity;

        public Circular_Queue2(int k) {
            capacity = k;
            data = new int[capacity];
            head = -1;
            tail = -1;
            size = 0;
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                head = 0;
            }
            tail = (tail + 1) % capacity;
            data[tail] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % capacity;
            }
            size--;
            return true;
        }

        public int Front() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return data[head];
        }

        public int Rear() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return data[tail];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public static void main(String[] args) {
            Circular_Queue2 circularQueue = new Circular_Queue2(3);
            System.out.println(circularQueue.enQueue(1));
            System.out.println(circularQueue.enQueue(2));
            System.out.println(circularQueue.enQueue(3));
            System.out.println(circularQueue.enQueue(4));
            System.out.println(circularQueue.Rear());
            System.out.println(circularQueue.isFull());
            System.out.println(circularQueue.deQueue());
            System.out.println(circularQueue.enQueue(4));
            System.out.println(circularQueue.Rear());
        }
    }

