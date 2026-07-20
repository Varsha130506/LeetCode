class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int s = 0;
            while (n > 0) {
                int r = n % 10;
                s += r * r;
                n /= 10;
            }
            n = s;
        }
        return n == 1;
    }
}