import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetCheck {
        public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
            return set2.containsAll(set1);
        }
        public static void main(String[] args) {
            // Test with HashSet
            Set<Integer> hashSet1 = new HashSet<>();
            Set<Integer> hashSet2 = new HashSet<>();
            hashSet1.add(1);
            hashSet1.add(2);
            hashSet2.add(1);
            hashSet2.add(2);
            hashSet2.add(3);

            System.out.println("HashSet: " + isSubset(hashSet1, hashSet2)); // true

            // Test with LinkedHashSet
            Set<Integer> linkedHashSet1 = new LinkedHashSet<>();
            Set<Integer> linkedHashSet2 = new LinkedHashSet<>();
            linkedHashSet1.add(1);
            linkedHashSet1.add(2);
            linkedHashSet2.add(1);
            linkedHashSet2.add(2);
            linkedHashSet2.add(3);

            System.out.println("LinkedHashSet: " + isSubset(linkedHashSet1, linkedHashSet2)); // true

            // Test with TreeSet
            Set<Integer> treeSet1 = new TreeSet<>();
            Set<Integer> treeSet2 = new TreeSet<>();
            treeSet1.add(1);
            treeSet1.add(2);
            treeSet2.add(1);
            treeSet2.add(2);
            treeSet2.add(3);

            System.out.println("TreeSet: " + isSubset(treeSet1, treeSet2)); // true
        }
}
