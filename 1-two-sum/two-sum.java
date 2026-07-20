class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = target - nums[i];
                if (a == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}