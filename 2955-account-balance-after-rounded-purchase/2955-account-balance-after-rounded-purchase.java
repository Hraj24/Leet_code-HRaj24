class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int balance = 100;

        if(purchaseAmount % 10  >= 5) {
            while(purchaseAmount % 10 != 0)
            {
              purchaseAmount++;
            }
        }
        else
        {
          while(purchaseAmount % 10 != 0)
          {
            purchaseAmount--;
          }
        }

        return balance - purchaseAmount;
    }
}