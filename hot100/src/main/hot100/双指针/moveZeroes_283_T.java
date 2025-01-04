package src.main.hot100.双指针;

public class moveZeroes_283_T {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        for (;fast < nums.length; fast++){
            if (nums[fast] == 0) continue;
            nums[slow] = nums[fast];
            slow ++;
            }
        for(; slow < nums.length; slow++){
            nums[slow] = 0;
        }

    }


}

