class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                str = str + ch;
            }
        }
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}