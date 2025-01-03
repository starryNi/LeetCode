package src.main.hot100.哈希;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive_128_F {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> hash = new HashSet<>();
        for (int num : nums){
            hash.add(num);
        }
        for (int num : hash){  // 原做：for (int num : nums){  这里填nums超时，因为hash会去重，减少操作
            int length = 1;
            if (!hash.contains(num - 1)){
                int currentNum = num;
                while (hash.contains(currentNum + 1)){
                    length ++;
                    currentNum += 1;
                }
            }
            res = Math.max(res, length);
        }
        return res;
    }
}
