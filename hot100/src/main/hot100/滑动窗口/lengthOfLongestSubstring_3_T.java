package main.hot100.滑动窗口;
import java.util.*;


public class lengthOfLongestSubstring_3_T {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        char[] charArray = s.toCharArray();
        Set<Character> chars = new HashSet<>();
        for (int i = 0, j = 0; j < charArray.length; ) {
            if (chars.contains(charArray[j])) {
                chars.remove(charArray[i]);
                i++;
            } else {
                chars.add(charArray[j]);

                res = Math.max(res, j - i + 1);
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int i = new lengthOfLongestSubstring_3_T().lengthOfLongestSubstring("abcabcbb");
        System.out.println(i);
    }

}
