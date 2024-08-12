import java.time.LocalDate;
public class Main11 {

        public static void main(String[] args) {
            PolicyManager11 manager = new PolicyManager11();


            manager.addPolicy(new Policy("P001", "John Doe", LocalDate.of(2024, 8, 15), "Health", 250.00));
            manager.addPolicy(new Policy("P002", "Jane Smith", LocalDate.of(2024, 8, 10), "Auto", 150.00));
            manager.addPolicy(new Policy("P003", "Alice Johnson", LocalDate.of(2024, 9, 5), "Home", 200.00));
            manager.addPolicy(new Policy("P004", "Bob Brown", LocalDate.of(2024, 7, 25), "Health", 300.00));
            manager.addPolicy(new Policy("P005", "Charlie White", LocalDate.of(2024, 8, 10), "Auto", 150.00)); // Duplicate policy

            System.out.println("All Unique Policies:");
            for (Policy policy : manager.getAllUniquePolicies()) {
                System.out.println(policy);
            }


            System.out.println("\nPolicies Expiring Soon:");
            for (Policy policy : manager.getPoliciesExpiringSoon()) {
                System.out.println(policy);
            }


            System.out.println("\nHealth Policies:");
            for (Policy policy : manager.getPoliciesByCoverage("Health")) {
                System.out.println(policy);
            }


            System.out.println("\nDuplicate Policies:");
            for (Policy policy : manager.findDuplicatePolicies()) {
                System.out.println(policy);
            }


            System.out.println("\nPerformance Comparison:");
            manager.comparePerformance(1000);
        }
    }


