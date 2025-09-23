class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0)
            return result;
        int r = matrix.length, c = matrix[0].length, toprow = 0, bottomrow = r - 1, left = 0, right = c - 1;
        int total = 0;

        while (total < r * c) {
            for (int i = left; i <= right && total < r * c; i++) {
                result.add(matrix[toprow][i]);
                total++;
            }
            toprow++;

            for (int i = toprow; i <= bottomrow && total < r * c; i++) {
                result.add(matrix[i][right]);
                total++;
            }
            right--;

            for (int i = right; i >= left && total < r * c; i--) {
                result.add(matrix[bottomrow][i]);
                total++;
            }
            bottomrow--;

            for (int i = bottomrow; i >= toprow && total < r * c; i--) {
                result.add(matrix[i][left]);
                total++;
            }
            left++;
        }
        return result;
    }

}