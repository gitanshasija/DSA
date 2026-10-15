class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] S = new int[200];
        int[] T = new int[200];

        int n = s.length();

        for(int i = 0; i < n; i++){
            if(S[s.charAt(i)] != T[t.charAt(i)]){
                return false;
            }
            S[s.charAt(i)] = i+1;
            T[t.charAt(i)] = i+1;
        }
        return true;
    }
}