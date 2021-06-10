package day8;

public class Main {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 2, 5};
        System.out.println(detectSum(num));
    }

    private static int detectSum(int[] num) {
        int a = 0;
        int b = 0;
        for (int n : num) {
            int temp = a;
            a = Math.max(a, b);
            b = n + temp;
        }
        return Math.max(a, b);
    }
}
