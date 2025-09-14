class Solution {
    static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long evenPos = (n + 1) / 2; 
        long oddPos = n / 2;        
        long evenWays = fastPower(5, evenPos); // 5 even digits
        long oddWays = fastPower(4, oddPos);   // 4 prime digits

        return (int)((evenWays * oddWays) % MOD);
    }

    long fastPower(long base, long power) {
        long result = 1;
        base %= MOD;

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % MOD; 
            }
            base = (base * base) % MOD; 
            power /= 2; 
        }
        return result;
    }
}