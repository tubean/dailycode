package day6;

public class Main {
    public static void main(String[] args) {
        String s = "12223";
        System.out.println(numDecodings(s));
    }

    // Sử dụng đệ quy: Chuỗi s có độ dài n
    // 1. Nếu ký tự số cuối cùng khác 0, đệ quy về giải quyết bài toán chuỗi có độ dài (n-1) và cộng kết quả vào mảng count
    // 2. Nếu 2 chữ số cuối < 27, đệ quy về giải quyết bài toán chuỗi có độ dài (n-2) và cộng kết quả vào mảng count
    private static int numDecodings(String s) {
        int n = s.length();
        int[] count = new int[n + 1];
        count[0] = count[1] = 1;
        if(s.charAt(0) =='0')
            return 0;
        for (int i = 2; i <= n; i++)
        {
            count[i] = 0;

            if (s.charAt(i - 1) > '0')
                count[i] = count[i - 1];

            if (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) < '7'))
                count[i] += count[i - 2];
        }
        return count[n];
    }

}
