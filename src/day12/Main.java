package day12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abvcss", 4));
    }

    private static int lengthOfLongestSubstring(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int begin = 0, end = 0;
        // The number of distinct character.
        int counter = 0;
        // The length of longest substring.
        int maxLen = 0;

        while (end < s.length()) {
            char cEnd = s.charAt(end);
            map.put(cEnd, map.getOrDefault(cEnd, 0) + 1);
            if (map.get(cEnd) == 1) {
                counter++;  //new char
            }
            end++;

            // counter > k means that
            // there are more than k distinct characters in the current window.
            // So we should move the sliding window.
            while (counter > k) {
                char cBegin = s.charAt(begin);
                map.put(cBegin, map.get(cBegin) - 1);
                if (map.get(cBegin) == 0) {
                    counter--;
                }
                begin++;
            }
            // Pay attention here!
            // We don't get/update the result in while loop above
            // Because if the number of distinct character isn't big enough, we won't enter the while loop
            // eg. s = "abc" (We'd better update the result here to avoid getting 0 length)
            maxLen = Math.max(maxLen, end - begin);
        }

        return maxLen;
    }
}
