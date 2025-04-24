public class FindEvenRecursive {
    public static boolean hasEven(int[] nums, int i) {
        if (i >= nums.length)
            return false;
        return (nums[i] % 2 == 0) || hasEven(nums, i + 1);
    }

    public static void main(String[] args) {
        int[] values = { 3, 5, 9, 2 };
        System.out.println(hasEven(values, 0) ? "Even number found" : "No even number");
    }
}
// This code demonstrates a recursive method to check if an array of integers
// contains any even numbers.
// The method `hasEven` checks each element starting from index `i` and returns
// true if an even number is found, otherwise it continues to the next index.