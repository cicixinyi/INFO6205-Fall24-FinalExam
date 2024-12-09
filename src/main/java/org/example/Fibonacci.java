package org.example;

public class Fibonacci {

    /**
     * Return the <code>n</code>th Fibonacci number.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return if <code>n</code> < 0 or <code>n</code> > 92 then -1;
     * else if <code>n</code> < 2 then <code>n</code>;
     * else <code>fibN(n-1)</code> + <code>fibN(n-2)</code>.
     */
    public long fibN(int n) {
        if(n < 0 || n >= memo.length) return -1L;
        if(memo[n] != -1) return memo[n];
        else if(n < 2) return n;
        else {
            memo[n] = fibN(n - 1) + fibN(n - 2);
            return memo[n];
        }
    }

    /**
     * Determine the sum of the first <code>n</code> Fibonacci numbers.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return the sum of the Fibonacci numbers 0 through n.
     */
    public long sumN(int n) {
        if(n < 0 || n > 93) return -1L;

        long sum =0;
        for(int i=0; i<=n; i++) {
            sum += fibN(i);
        }
        return sum;
    }

    public Fibonacci() {
        memo[0] = 0;
        memo[1] = 1;
        for(int i=2; i<memo.length; i++) {
            memo[i] = -1;
        }
    }

    private final long[] memo = new long[93];
}