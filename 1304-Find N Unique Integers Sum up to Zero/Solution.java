class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int start = 0;
        
        if (n % 2 != 0) {
            result[start++] = 0;
        }
        for (int i = 1; i <= n / 2; i++) {
            result[start++] = i;
            result[start++] = -i;
        }
        
        return result; 
    }
}