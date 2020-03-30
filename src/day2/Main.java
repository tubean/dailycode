package day2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] A = {10, 3, 5, 6, 2};
//        productUsingRecursion(A, 1,0);
//        System.out.println(Arrays.toString(A));

        printProduct(A);

    }

    // Method 1
    private static void printProduct(int[] arr) {
        int n = arr.length;
        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }

        int i, temp = 1;

        /* Allocate memory for the product array */
        int[] prod = new int[n];

        /* Initialize the product array as 1 */
        Arrays.fill(prod, 1);

        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        /* print the constructed prod array */
        System.out.println(Arrays.toString(prod));

    }

    // Method 2
    private static int productUsingRecursion(int[] nums, int p, int n) {
        return (n == nums.length) ? 1
                : nums[n] * (p = productUsingRecursion(nums, nums[n] * (nums[n] = p), n + 1))
                + 0*(nums[n] *= p);

    }
}
