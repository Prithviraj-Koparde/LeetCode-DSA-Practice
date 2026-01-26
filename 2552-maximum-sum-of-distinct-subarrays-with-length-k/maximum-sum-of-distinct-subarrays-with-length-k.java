class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> windowSet = new HashSet<>();
        long windowSum = 0;
        long maxSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {

            // if value already in hashset
            while (windowSet.contains(nums[right])) {
                windowSum -= nums[left];
                windowSet.remove(nums[left]);
                left++;
            }

            windowSum += nums[right];
            windowSet.add(nums[right]);

            // if window size hits k
            if (windowSet.size() == k) {
                maxSum = Math.max(windowSum, maxSum);

                //slide window forward
                windowSum -= nums[left];
                windowSet.remove(nums[left]);
                left++;
            }

        }
        return maxSum;
    }
}