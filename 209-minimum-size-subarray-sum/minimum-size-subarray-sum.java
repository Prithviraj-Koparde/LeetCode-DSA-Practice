class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window = 0, left = 0, n = nums.length, ans = n + 1;

        for (int right = 0; right < n; right++) {
            window = window + nums[right];

            while (window >= target) {
                ans = Math.min(ans, right - left + 1);
                window = window - nums[left];
                left++;
            }
        }
        return ans == n + 1 ? 0 : ans;
    }
}