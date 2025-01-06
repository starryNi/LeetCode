package src.main.hot100.双指针;

public class maxArea_11_F {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right){
            res = Math.max(res, (right - left) * Math.min(height[left], height[right]));
            if (height[left] > height[right]) right--;
            else left ++;
        }
        return res;
    }
}
