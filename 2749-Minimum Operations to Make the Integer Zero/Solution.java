class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
          for (long k = 1; k <= 65; k++) {
            long rem = (long) num1 - k * num2;
            if (rem < 0) {
                continue;
            }
            if (rem < k) {
                continue;
            }
            long bits = Long.bitCount(rem);
            if (bits <= k) {
                return (int) k;
            }
        }
        return -1;
    }
}