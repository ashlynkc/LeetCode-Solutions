// Solution learned and followed by: https://www.youtube.com/watch?v=6PrIRPpTI9Q
// Java 
// LeetCode No. 11

class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;

        // left and right pointer moving inwards
        int left = 0;
        int right = height.length - 1;

        // stop when the pointers cross eachother
        while (left < right) {

            if (height[left] < height[right]) {

                maxWater = Math.max(maxWater, height[left] * (right - left));
                left += 1;

            } else {

                maxWater = Math.max(maxWater, height[right] * (right - left));
                right -= 1;

            }
        }

        return maxWater;
    }
}
