class Solution {
    public int rob(int[] nums) {
        int prev = 0;
        int curr = 0;

        for (int money : nums) {

            int rob = prev + money;
            int skip = curr;

            int next = Math.max(rob, skip);

            prev = curr;
            curr = next;
        }

        return curr;
    }
}