package day1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        int[] A = {1, 4, 45, 6, 10, 8, 7, 11, 5};
        int n = 17;
        printPairs(A, n);
    }

    private static void printPairs(int[] initArr, int sum) {
        HashSet<Integer> hs = new HashSet<>();
        boolean isExist = false;
        for (int value : initArr) {
            int temp = sum - value;
            if (hs.contains(temp)) {
                System.out.println("System found " + value + " and " + temp);
                isExist = true;
            }
            hs.add(value);
        }
        if(!isExist) {
            System.out.println("There is no satisfiable pair");
        }
    }
}
