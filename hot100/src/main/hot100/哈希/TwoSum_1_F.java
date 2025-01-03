package src.main.hot100.哈希;

import java.util.*;

/**
 * 1.整体上是采用哈希表，但不是在开头把所有nums元素装进去，而是动态装入，就是检验找不到后才装入map
 * 2.
 */
public class TwoSum_1_F {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) return res;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int t = target - temp;
            if (map.containsKey(t)){
                res[0] = map.get(t);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] ints = new int[Integer.MAX_VALUE];
        String[] split = s.split(",");
        int i = 0;
        for (String t : split){
            ints[i++] = Integer.valueOf(s);
        }
        int target = sc.nextInt();
        int[] res = twoSum(ints, target);
        System.out.println(res);
    }
}
