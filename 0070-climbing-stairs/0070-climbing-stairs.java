class Solution {
    public int climbStairs(int n) {
           int prev = 1;
        int curr = 2;

        if (n == 1) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}