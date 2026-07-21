class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        // Length of the string
        int n = s.length();
        // Stores the total number of active sections (1s) already present
        int totalOnes = 0;
        // Count all the 1s in the string
        for (char c : s.toCharArray()) {
            if (c == '1')
                totalOnes++;
        }
        // If no trade is possible, answer will at least be the current number of 1s
        int ans = totalOnes;
        // Pointer used to traverse the string
        int i = 0;
        // Traverse the complete string
        while (i < n) {
            // ---------------- LEFT ZERO BLOCK ----------------
            // Stores the size of the zero block before a block of 1s
            int leftZero = 0;
            // Count consecutive zeros
            while (i < n && s.charAt(i) == '0') {
                leftZero++;
                i++;
            }
            // ---------------- ONE BLOCK ----------------
            // Stores the size of the consecutive 1s
            int oneBlock = 0;
            // Count consecutive ones
            while (i < n && s.charAt(i) == '1') {
                oneBlock++;
                i++;
            }
            // ---------------- RIGHT ZERO BLOCK ----------------
            // Stores the size of the zero block after the block of 1s
            int rightZero = 0;
            // Count consecutive zeros
            while (i < n && s.charAt(i) == '0') {
                rightZero++;
                i++;
            }
            if (leftZero > 0 && oneBlock > 0 && rightZero > 0) {
                // Total active sections after trade
                int current = totalOnes + leftZero + rightZero;
                // Store the maximum answer
                ans = Math.max(ans, current);
            }
            i -= rightZero;
        }
        // Return the maximum active sections possible
        return ans;
    }
}