package recursion;

class Solution {
    int MOD = (int) (Math.pow(10, 9) + 7);

    public long mul(long a, long b) {
        return ((a % MOD) * (b % MOD)) % MOD;
    }

    public int powerFn(int a, long n) {
        if (n == 0)
            return 1;
        long partialAns = powerFn(a, n / 2);
        partialAns = mul(partialAns, partialAns);
        if (n % 2 == 0)
            return (int) partialAns;
        return (int) mul(partialAns, a);
    }

    public int countGoodNumbers(long n) {
        if (n == 1)
            return 5;
        if (n % 2 == 0)
            return powerFn(20, n / 2);
        return (int) mul(powerFn(20, n / 2), 5);
    }
}
