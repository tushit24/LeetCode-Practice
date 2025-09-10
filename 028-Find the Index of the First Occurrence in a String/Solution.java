class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
    
            String substring = haystack.substring(i, i + m);

            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1; 
    }
}