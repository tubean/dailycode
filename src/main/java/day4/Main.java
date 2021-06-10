package day4;

/**
 * Solve problem of 4th day
 * Creator: TuDA
 */
public class Main {
    public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int n = nums.length;
        boolean containsOne = false;

        // step 1: check array contains number 1 and replace all negative number or greater than n to 1.
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                containsOne = true;
            } else if (nums[i] <= 0 || nums[i] > n) nums[i] = 1;
        }

        // return 1 when there is no number 1 in array
        if (!containsOne) return 1;

        // step 2: find index of each element in sequence array
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }

        // step 3: in the new array, find the first number which greater than 0 then return its index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return i + 1;
        }

        // special case: 1,2,3 -> 4
        return n + 1;
    }
}
