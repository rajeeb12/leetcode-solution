class Solution {
    public int specialArray(int[] nums) {
        
        int low = 0 , high = 1000;
        while(low <= high){ 
            int mid = (low + high) >> 1;
            int count = getCount(mid, nums);
            if(mid == count){
                return mid;
            }else if(count > mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public int getCount(int num,int nums[]){
        int count = 0;
        
        for(int it: nums){
            if(it >= num) count++;
        }
        return count;    
    }
}