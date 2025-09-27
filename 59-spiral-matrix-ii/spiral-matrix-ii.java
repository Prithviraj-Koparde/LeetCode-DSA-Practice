class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int r = arr.length, c = arr[0].length;
        int left = 0, right = c - 1, toprow = 0, bottomrow = r - 1, total = 0;
        int num = 1;

        while (toprow <= bottomrow && left <= right) {
            // right to left print toprow
            for (int i = left; i <= right; i++) {
                arr[toprow][i] = num++;
            }
            toprow++;

            // toprow to bottomrow print right col
            for (int j = toprow; j <= bottomrow; j++) {
                arr[j][right] = num++;
            }
            right--;

            // right to left print bottom row
            for (int i = right; i >= left; i--) {
                arr[bottomrow][i] = num++;
            }
            bottomrow--;

            // bottomrow to toprow print left col
            for (int j = bottomrow; j >= toprow; j--) {
                arr[j][left] = num++;
            }
            left++;

        }
        return arr;
    }
}