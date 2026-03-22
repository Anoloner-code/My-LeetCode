class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int area = 0;
        int arraylength = height.length;
        int left = 0; int right = arraylength-1;
        while (left < right) {
            area = (right - left) * Math.min(height[left],height[right]);
            if (area > maxarea) maxarea = area;
            if (height[left] > height[right] ) {
                right--;
            } else {
                left++;
            }
            
        }
        return maxarea;
    }
}
