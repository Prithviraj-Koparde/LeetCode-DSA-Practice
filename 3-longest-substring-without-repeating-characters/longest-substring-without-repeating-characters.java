class Solution {
    public int lengthOfLongestSubstring(String s) {
        long currCount = 0;
        int left = 0;
        int maxLen = 0;
        Set<Character> windowSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (windowSet.contains(c)) {
                windowSet.remove(s.charAt(left));
                left++;
            }

            windowSet.add(c);
            maxLen = Math.max(windowSet.size(), maxLen);
        }
        return maxLen;
    }
}