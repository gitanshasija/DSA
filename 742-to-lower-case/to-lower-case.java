class Solution {
    public String toLowerCase(String s) {
        String ans = "";

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(65<=ch && ch<=90){
                ans = ans + (char)(ch+32);

            }
            else{
                ans = ans + ch;
            }
        }
        return ans;
    }
}