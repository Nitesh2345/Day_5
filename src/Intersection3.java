import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Intersection3 {

        public static void main(String[] args) {
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();

            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);

            list2.add(6);
            list2.add(4);
            list2.add(5);

            Integer intersection = findIntersection(list1, list2);
            if (intersection != null) {
                System.out.println("Intersection point: " + intersection);
            } else {
                System.out.println("No intersection point found.");
            }
        }

        public static Integer findIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {
            Set<Integer> set = new HashSet<>(list1);
            for (Integer value : list2) {
                if (set.contains(value)) {
                    return value;
                }
            }
            return null;
        }
}

