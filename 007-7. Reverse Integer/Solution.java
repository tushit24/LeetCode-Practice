class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;      // for last digit
            x /= 10;               // Remove the last digit

            // Checking  for overflow
            if (rev > Integer.MAX_VALUE / 10 || 
               (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || 
               (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            /* 7 and -8 are last digit of maximum and minimum of 32 bit integers which is why
            they are used to catch final possible overflow condition*/

            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.reverse(123);
        System.out.println(result); // Output: 321
    }
}