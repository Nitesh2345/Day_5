
    import java.util.LinkedList;

    public class RemoveOccurences10{
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);
            list.add(4);
            list.add(2);

            System.out.println("Original list: " + list);

            int valueToRemove = 2;
            LinkedList<Integer> toRemove = new LinkedList<>();
            toRemove.add(valueToRemove);

            list.removeAll(toRemove);

            System.out.println("List after removal: " + list);
        }
}
