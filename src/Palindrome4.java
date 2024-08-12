import java.util.LinkedList;
import java.util.List;

    public class Palindrome4{
        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);
            list.add(1);

            boolean isPalindrome = checkPalindrome(list);
            System.out.println("Is palindrome: " + isPalindrome);
        }

        public static boolean checkPalindrome(LinkedList<Integer> list) {
            List<Integer> arrayList = new LinkedList<>(list);
            int left = 0;
            int right = arrayList.size() - 1;

            while (left < right) {
                if (!arrayList.get(left).equals(arrayList.get(right))) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
