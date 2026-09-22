class Solution {
    private boolean canfish(int[] piles, int speed, int h){
        long hours = 0;

        for(int pile:piles){
            hours = hours + (pile + speed -1)/speed;

            if(hours > h){
                return false;
            }
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int i = 0; i < piles.length; i++){
            high = Math.max(high,piles[i]);
        }
        

        while(low<=high){
            int mid = low + (high-low)/2;
            
            if (canfish(piles,mid,h)){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}