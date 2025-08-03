class Solution {
    public boolean isPalindrome(int x) {
     if (x < 0) {
            return false;
        }

        int reverse = 0;
        int a = x;

        while (x > 0) {
            int r=x%10;
            reverse = (reverse * 10) + r;
            x =x/ 10;
        }

        return reverse == a;             
}
}