class Solution {
    public boolean isThree(int n) {
        int cnt = 0;
        int num = 1;
        while(num<=n){
            if(n%num==0) cnt++;
            num++;
        }
        return cnt==3;
    }
}