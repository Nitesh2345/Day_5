import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SortUniqueElement {

        public static Set<Integer> sortAndRemoveDuplicates(List<Integer> list) {
            return new TreeSet<>(list);
        }

        public static void main(String[] args) {
            List<Integer> list = List.of(5, 3, 8, 3, 1, 9, 5, 2);
            Set<Integer> treeSet = sortAndRemoveDuplicates(list);

            System.out.println("Original list: " + list);
            System.out.println("TreeSet (sorted, no duplicates): " + treeSet);
        }
    }
