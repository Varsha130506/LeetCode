class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        int lowDigits = String.valueOf(low).length();
        int highDigits = String.valueOf(high).length();
        for (int len = lowDigits; len <= highDigits; len++) {
            for (int start = 0; start <= 9 - len; start++) {
                String sub = s.substring(start, start + len);
                int num = Integer.parseInt(sub);
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}