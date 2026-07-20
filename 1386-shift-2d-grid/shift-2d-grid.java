class Solution {
    public List<List<Integer>>/* retuen a 2d list */ shiftGrid /* method name */ (int[][] grid /* i/p matrix */ , int k /*no of shifts */) {
        int m = grid.length; // no of rows
        int n = grid[0].length; // no of columns
        List<List<Integer>> ans = new ArrayList<>(); // empty array
        int total = m * n; // total no of elements
        k = k % total; // this matters to not let the grid b back to sq1
        int[] arr = new int[total]; // create 1d array with total no of elements
        int index = 0; // initially index is 0 
        for(int i = 0; i < m; i++){ //every row vistation
            for(int j = 0; j < n; j++){ // every column vistation
                arr[index++] = grid[i][j]; // copy each element from grid to 1d array
            }
        }
        for(int i = 0; i < m; i++){ // each row of answer
            List<Integer> row = new ArrayList<>(); // empty row creation
            for(int j = 0; j < n; j++){// each column of this row is filled
                // converts 2d position into 1d index: i*n+j
                //Eg: (2,1) = 2*3+1=7
                int newIndex = (total - k + i*n + j) % total;// formula
                row.add(arr[newIndex]); // add chosen no to current row
            }
            ans.add(row);// one row over --> add to final ans
        }
        return ans;//print shifted 2d array
    }
}