package src.main.hot100.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.没有考虑跳过重复元素，原做超时
 * 2.匹配成功后，还需要继续移动left与right，并不代表当前i  匹配完了
 */
public class threeSum_15_F {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            // 跳过重复元素
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            int temp = -nums[i];
            while (left < right) {
                int sum = nums[right] + nums[left];
                if (sum == temp) {
                    List<Integer> integers = new ArrayList<>();
                    integers.add(nums[i]);
                    integers.add(nums[left]);
                    integers.add(nums[right]);
                    res.add(integers);
                    left++;
                    right--;
                    // 跳过重复元素
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum > temp) {
                    right--;
                }else {
                    left ++;
                }
            }
        }
        return res;
    }
}
