class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        int ans = -1;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        int low = 1, high = max;

        while(low<=high){
            int sum = 0;
            int mid = low + (high - low)/2;
             
            for(int i = 0; i < n; i++){
            sum += Math.ceil((double) nums[i] / mid);
            }

            if(sum<=threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}