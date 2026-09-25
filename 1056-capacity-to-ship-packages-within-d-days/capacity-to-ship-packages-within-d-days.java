class Solution {

    private boolean possiblecapacity(int[] weights, int days, int capacity){
        int daysused = 1;
        int currentweight = 0;

        for(int weight:weights){
            if(currentweight + weight > capacity){
                daysused++;
                currentweight = weight;
            }
            else{
                currentweight = currentweight + weight;
            }
        }
        return daysused<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight:weights){
            low = Math.max(low, weight);
            high = high + weight;
        }

        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(possiblecapacity(weights, days, mid)){
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