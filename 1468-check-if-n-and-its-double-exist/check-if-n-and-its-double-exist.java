class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for(int i = 0; i < n; i++ ){
            int ans = 2 * arr[i];
            int low = 0;
            int high = n - 1;

            while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == ans && mid!= i) return true;

            if(arr[mid] < ans){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        }
        return false;
        
    }
}