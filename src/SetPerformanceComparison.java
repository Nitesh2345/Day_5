import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetPerformanceComparison {

        private static final int DATASET_SIZE = 1000000;

        public static void main(String[] args) {
            // Generate a large dataset
            Set<Integer> dataset = new HashSet<>();
            for (int i = 0; i < DATASET_SIZE; i++) {
                dataset.add(i);
            }

            // Test HashSet
            Set<Integer> hashSet = new HashSet<>();
            measurePerformance("HashSet", hashSet, dataset);

            // Test LinkedHashSet
            Set<Integer> linkedHashSet = new LinkedHashSet<>();
            measurePerformance("LinkedHashSet", linkedHashSet, dataset);

            // Test TreeSet
            Set<Integer> treeSet = new TreeSet<>();
            measurePerformance("TreeSet", treeSet, dataset);
        }

        private static void measurePerformance(String setType, Set<Integer> set, Set<Integer> dataset) {
            long startTime, endTime;

            // Measure add operation
            startTime = System.nanoTime();
            for (Integer value : dataset) {
                set.add(value);
            }
            endTime = System.nanoTime();
            System.out.println(setType + " add: " + (endTime - startTime) / 1e6 + " ms");

            // Measure contains operation
            startTime = System.nanoTime();
            for (Integer value : dataset) {
                set.contains(value);
            }
            endTime = System.nanoTime();
            System.out.println(setType + " contains: " + (endTime - startTime) / 1e6 + " ms");

            // Measure remove operation
            startTime = System.nanoTime();
            for (Integer value : dataset) {
                set.remove(value);
            }
            endTime = System.nanoTime();
            System.out.println(setType + " remove: " + (endTime - startTime) / 1e6 + " ms");
        }
}