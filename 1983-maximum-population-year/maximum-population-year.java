class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxpop = 0;
        int ans = 0;
        
        for(int year = 1950;year < 2050; year++){
            int population = 0;

            for(int i = 0;i<logs.length;i++){
                if(logs[i][0]<=year && year<logs[i][1]){
                    population++;
                }
            }
            if(population>maxpop){
                maxpop = population;
                ans = year;
            }
        }
        return ans;
    }
}