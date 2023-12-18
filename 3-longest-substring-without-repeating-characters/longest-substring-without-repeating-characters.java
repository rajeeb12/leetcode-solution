class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0;
        while(right < n)
        {
            char ch= s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.get(ch) > 1)
            {
                while(map.get(ch) > 1 && left < right)
                {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    left++;
                }
            }
            max = Math.max(max, right - left + 1);
            right++;
        }   
        return max;
    }
}