import java.util.*;
public class InsertionOrder {
    public static Set<String> removeDuplicatesAndMaintainOrder(List<String> list) {
            return new LinkedHashSet<>(list);
        }

        public static void main(String[] args) {
            List<String> list = List.of("apple", "banana", "apple", "orange");
            Set<String> linkedHashSet = removeDuplicatesAndMaintainOrder(list);

            System.out.println("Original list: " + list);
            System.out.println();
            System.out.println("LinkedHashSet (no duplicates, order maintained): " + linkedHashSet);
        }
}
