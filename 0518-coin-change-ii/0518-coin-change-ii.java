class Solution {
    public int change(int amount, int[] coins) {
        int []dp = new int[amount+1];

        dp[0] =1;

        for(int i=1;i<amount+1;i++)
        {
            dp[i] = 0;
        }

        for(int coin: coins)
        {
            for(int j=coin;j<=amount;j++)
            {
                dp[j] += dp[j-coin];
            }
        }

        return dp[amount];
    }
}