class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in dec part of arr
                //mid can be the answer but we will look at left isiliye end!=mid-1;
                end = mid;
            }
            else{
                //you are in asc part of array
                start = mid+1;
            }
        }
        return start; // or return end as both are equal
    }
}