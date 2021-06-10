package day4;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemDay4Test {

    // if there is 1 element in array, return 1
    @Test
    public void testArrayHasOneItem() {
        int[] arr = {10};
        assertEquals(1, Main.firstMissingPositive(arr));
    }

    // return 1 if array null
    @Test
    public void testArrayNull() {
        assertEquals(1, Main.firstMissingPositive(null));
    }

    @Test
    public void testArrayNotContainsOne() {
        int[] arr = {10, 3, 5, 6, 2, -3};
        assertEquals(1, Main.firstMissingPositive(arr));
    }

    @Test
    public void testArrayHasItemLargerArrayLength() {
        int[] arr = {10, 30, 50, 60, 22, 30};
        assertEquals(1, Main.firstMissingPositive(arr));
    }

    @Test
    public void testArrayNegative() {
        int[] arr = {-1,-2,-7,-10,-11}; // 1 is missing number
        assertEquals(1, Main.firstMissingPositive(arr));
    }

    @Test
    public void testArrayPositive() {
        int[] arr = {1,2,3,4,5,6,7}; // 8 is missing number
        assertEquals(8, Main.firstMissingPositive(arr));
    }

    @Test
    public void testArrayRandom() {
        int[] arr = {1,-5,9,2,3,-7,-6,5,8}; // 4 is missing number
        assertEquals(4, Main.firstMissingPositive(arr));
    }
}
