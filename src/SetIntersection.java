
    import java.util.HashSet;
    import java.util.Set;

    public class SetIntersection {

        public static <T> Set<T> findIntersection(Set<T>... sets) {
            if (sets == null || sets.length == 0) {
                return new HashSet<>();
            }

            Set<T> intersection = new HashSet<>(sets[0]);
            for (Set<T> set : sets) {
                intersection.retainAll(set);
            }

            return intersection;
        }

        public static void main(String[] args) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> set3 = new HashSet<>();

            // Adding elements to the sets
            for (int i = 1; i <= 5; i++) {
                set1.add(i);
            }
            for (int i = 3; i <= 7; i++) {
                set2.add(i);
            }
            for (int i = 5; i <= 9; i++) {
                set3.add(i);
            }

            // Finding intersection
            Set<Integer> intersection = findIntersection(set1, set2, set3);

            // Printing the intersection
            System.out.println("Intersection of sets: " + intersection);
        }
    }

