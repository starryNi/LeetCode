# 209. 长度最小的子数组_T
> 前提条件：连续子数组

> 注意到滑动窗口使用for  while这种固定模板. 遍历右端点，然后让左端点在while循环里来逼近题目条件
```java
public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int res = n + 1;
        for (int i = 0, j = 0; j < n ; j++) {
            sum += nums[j];
            while (sum >= target){
                res = Math.min(res, j - i + 1);
                sum -= nums[i];
                i ++;
            }
        }
        return res == n + 1 ? 0: res;
    }
```
# 713. 乘积小于 K 的子数组_F
> 这道题注意开始的判断if (k <= 1) return 0; 不判断，k为0的时候会在while那里造成死循环从而越界
```java
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
```