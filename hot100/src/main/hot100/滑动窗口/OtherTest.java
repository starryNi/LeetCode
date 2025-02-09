package main.hot100.滑动窗口;

public class OtherTest {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int res = 0;
        int m = 1;
        int n = nums.length;
        for (int i = 0, j = 0; j < n; j++) {
            m *= nums[j];
            while (m >= k){
                m /= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;

    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        int i = numSubarrayProductLessThanK(ints, 0);
    }
}
