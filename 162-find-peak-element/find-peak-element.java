class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //dec arr and answer can be equal to mid but we will check in left side
                end = mid;
            }
            else{
                //asc side
                start = mid + 1;

            }
        }
        return start;
    }
}