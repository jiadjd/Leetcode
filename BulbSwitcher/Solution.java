package BulbSwitcher;

class Solution {
	// only when n has an odd number of divisors, will it eventually be switched on
	// e.x. n = 4, divisors are 1, 2, 4, n ends up being switched on
	// e.x. 1, 4, 9, 16, 25, 36.....
    public int bulbSwitch(int n) {
        int result = 1;
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int i=2;
        while(Math.pow(i, 2) <= n) {
            result++;
            i++;
        }
        return result;
    }
}
