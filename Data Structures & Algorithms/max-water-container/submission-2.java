class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;
        while (left<right) {
            int tempArea = Math.min(heights[left],heights[right]) * (right-left);
            maxArea = Math.max(maxArea, tempArea);
            if (heights[left]<heights[right]) {
                left++;
            } else if (heights[left]>heights[right]) {
                right--;
            } else {
                if (left<right && heights[left+1]>heights[right-1]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return maxArea;
    }
}
