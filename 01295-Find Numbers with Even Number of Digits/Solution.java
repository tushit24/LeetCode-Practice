class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            String y = Integer.toString(i);
            if (y.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}