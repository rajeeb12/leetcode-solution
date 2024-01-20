class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0 , j = height.length - 1;
        while(i < j)
        {
            int min = Math.min(height[i] , height[j]); 
            maxArea = Math.max(maxArea, min * (j - i));
            if(height[i] <= height[j])
            {
                i++;
            }else{
                j--;
            }
        }
        return maxArea;
    }
}