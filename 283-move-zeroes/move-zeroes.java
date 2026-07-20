class Solution {
            //pointer approach :left & right 
    public void moveZeroes(int[] nums) {
        // left says where next non-zero integer will b going to
        int left = 0;
        // right for travelling thru the array
        // initially right is 0 with range less then the length of array n +1 after each iteration
        for (int right = 0; right < nums.length; right++) {
            //if current element is non-zero, move it to front thru swapping method
            if (nums[right] != 0) {
                // swapping of two numbers with third variable
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                // increase value of left by 1 by post increment operator
                left++;
            }
        }        
    }
}