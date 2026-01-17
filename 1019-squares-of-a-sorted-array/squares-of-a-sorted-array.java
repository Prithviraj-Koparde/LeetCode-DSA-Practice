class Solution {
    public int[] sortedSquares(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int k = arr.length - 1;
        int[] ans = new int[arr.length];
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                k--;
                i++;
            } else {
                ans[k] = arr[j] * arr[j];
                k--;
                j--;
            }
        }
        return ans;
    }
}