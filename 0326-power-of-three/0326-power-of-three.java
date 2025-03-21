class Solution {
    public boolean isPowerOfThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            } else {
                n = n / 3;
            }

        }
        return n==1;
    }
}