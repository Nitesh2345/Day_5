import java.util.LinkedList;

    public class Remove_nthnode2 {
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            int n = 2;

            removeNthFromEnd(list, n);
            System.out.println(list);
        }

        public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
            int size = list.size();
            if (n > size) {
                System.out.println("N is greater than the size of the list.");
                return;
            }
            list.remove(size - n);
        }
}
