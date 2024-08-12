import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

    public class NonRpeatingChar8{
        public static void main(String[] args) {
            String stream = "aabcdbcda";
            findFirstNonRepeating(stream);
        }
        public static void findFirstNonRepeating(String stream) {
            Map<Character, Integer> charCount = new HashMap<>();
            Queue<Character> queue = new LinkedList<>();

            for (char ch : stream.toCharArray()) {
                charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
                queue.add(ch);

                while (!queue.isEmpty() && charCount.get(queue.peek()) > 1) {
                    queue.poll();
                }

                if (queue.isEmpty()) {
                    System.out.println("No non-repeating character");
                } else {
                    System.out.println("First non-repeating character is: " + queue.peek());
                }
            }
        }
}
