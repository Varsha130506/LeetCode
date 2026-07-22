class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            n += i - nums[i];
        }
        return n;       
    }
}

// [3 0 1]
// i=0    i=1    i=2
// n=3    n=0    n=1
// 3+0-3  0+1-0  1+2-1
// 0      1      2

// [0 1]
// i=0    i=1
// n=2    n=2
// 2+0-0  2+1-1
// 2      2

// [9 6 4 2 3 5 7 0 1]
// i=0    i=1     i=2      i=3      i=4      i=5     i=6     i=7     i=8
// n=9    n=0     n=-5     n=-7     n=-6     n=-5    n=-5    n=-6    n=1
// 9+0-9  0+1-6   -5+2-4   -7+3-2   -6+4-3   -5+5-5  -5+6-7  -6+7-0  1+8-1
// 0      -5      -7       -6       -5       -5      -6      1       8