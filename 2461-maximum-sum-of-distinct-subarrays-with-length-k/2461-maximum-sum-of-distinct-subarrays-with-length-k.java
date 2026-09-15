import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0;
        long maximum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i >= k) {
                int old = nums[i - k];

                sum -= old;

                map.put(old, map.get(old) - 1);

                if (map.get(old) == 0) {
                    map.remove(old);
                }
            }
            if (i >= k - 1 && map.size() == k) {
                maximum = Math.max(maximum, sum);
            }
        }

        return maximum;
    }
}