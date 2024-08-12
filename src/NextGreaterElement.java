
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result array with -1 for elements with no next greater element
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Traverse the array
        for (int i = 0; i < n; i++) {
            // While stack is not empty and the current element is greater than the element
            // at the index of the top of the stack
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i];
            }
            // Push the index of the current element onto the stack
            stack.push(i);
        }

        // Elements left in the stack do not have a next greater element
        // Result array already initialized with -1 for these elements

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        int[] result = nextGreaterElement(nums);

        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}