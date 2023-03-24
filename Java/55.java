// Solution learned and followed by: https://www.youtube.com/watch?v=Yan0cv2cLy8
// Java, Greedy algorithm solution
// LeetCode No. 55

class Solution {
    public boolean canJump(int[] nums) {
        int jumpIdx = nums.length - 1;
        
        for (int i = jumpIdx; i >= 0; i--) {
            if (i + nums[i] >= jumpIdx)
                jumpIdx = i;
        }

        return jumpIdx == 0;
    }
}
