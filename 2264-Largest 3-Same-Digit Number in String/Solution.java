class Solution {
    public String largestGoodInteger(String num) {
          String largestGood = "";
        for (int i = 0; i < num.length() - 2; i++) {
            char firstDigit = num.charAt(i);
            char secondDigit = num.charAt(i + 1);
            char thirdDigit = num.charAt(i + 2);

            if (firstDigit == secondDigit && secondDigit == thirdDigit) {
                String currentGood = num.substring(i, i + 3);

                if (largestGood.isEmpty() || currentGood.compareTo(largestGood) > 0) {
                    largestGood = currentGood;
                }
            }
        }
        return largestGood;
    }
}