import java.util.*;

public class ClassBehavior {
        public static Set<Integer> createHashSet() {
            Set<Integer> hashSet = new HashSet<>();
            hashSet.add(1);
            hashSet.add(2);
            hashSet.add(3);
            return hashSet;
        }

        public static Set<Integer> createLinkedHashSet() {
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add(7);
            linkedHashSet.add(2);
            linkedHashSet.add(3);
            return linkedHashSet;
        }

        public static Set<Integer> createTreeSet() {
            Set<Integer> treeSet = new TreeSet<>();
            treeSet.add(1);
            treeSet.add(2);
            treeSet.add(3);
            return treeSet;
        }

        public static void main(String[] args) {
            Set<Integer> hashSet = createHashSet();
            Set<Integer> linkedHashSet = createLinkedHashSet();
            Set<Integer> treeSet = createTreeSet();

            System.out.println("HashSet: " + hashSet);
            System.out.println("LinkedHashSet: " + linkedHashSet);
            System.out.println("TreeSet: " + treeSet);
        }
    }

