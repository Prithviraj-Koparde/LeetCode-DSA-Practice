class Solution {
    public boolean isBalanced(String num) {
        int Esum = 0;
        int Osum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (i % 2 == 0) {
                Esum += digit;
            } else {
                Osum += digit;
            }
        }
        return Esum == Osum;
    }
}