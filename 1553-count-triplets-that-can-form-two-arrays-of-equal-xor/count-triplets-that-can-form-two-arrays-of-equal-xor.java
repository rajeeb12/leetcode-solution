class Solution {
    public int countTriplets(int[] arr) {

        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int a = 0 , b = 0;
                for(int l = i; l < j; l++){
                    a ^= arr[l];
                }
                for(int m = j; m <= n - 1; m++){
                    b ^= arr[m];
                    if(b == a) count++;
                }
            }
        }
        return count;   
    } 
}