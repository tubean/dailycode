package day11;

public class Main {
    public static void main(String[] args) {
        int[] X = {1, 2};
        System.out.println(countCase(5, X));
    }

    private static int countCase(int n, int[] X) {
        int[] cache = new int[n+1];

        cache[0] = 1;
        for (int i = 0; i < n + 1; i++) {
            boolean isExist = false;
            for (int x : X) {
                if(i == x) isExist = true;
                if(i > x) cache[i] += cache[i-x];
            }
            if(isExist) cache[i] += 1;
        }

        return cache[n];
    }
}
