class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, countZ = 0, max = 0;

        while(right < nums.length)
        {
            if(nums[right] == 0)
            {
                countZ++;
            }
            while(countZ > k)
            {
                if(nums[left] == 0)
                {
                    countZ--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}