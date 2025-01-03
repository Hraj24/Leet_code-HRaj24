class Solution {
    public int maxProfit(int[] prices) {
        int buyAt=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            buyAt=Math.min(buyAt,prices[i]);
            profit=Math.max(profit,prices[i]-buyAt);
        }
        return profit; 
    }
}