class Solution {
    public boolean isPowerOfTwo(int n) {
        double num = n;
        while (num > 1) {
            num = num / 2;
        }
        if (num == 1.0) {
            return true;
        }
        return false;
    }
}