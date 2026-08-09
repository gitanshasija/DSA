class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        //find maximum first
        int max = candies[0];
        for(int i = 0;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        //check for each kid
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
       return result;
    }
}