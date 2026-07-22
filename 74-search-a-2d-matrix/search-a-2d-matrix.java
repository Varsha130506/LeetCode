class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;//rows
        int n = matrix[0].length;//columns
        int left = 0, right = m * n - 1;//assume one sorted array
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // mid/n for row 
            //mid%n for column
            int mid_val = matrix[mid / n][mid % n];
            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}