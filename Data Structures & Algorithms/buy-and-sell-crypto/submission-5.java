class Solution {
    public int maxProfit(int[] prices) {
        // min buy in and max sell 
        // what is min buy?
        // what is the max buy 

        // first keep track of the min after prices[0]
        // 
        int profit=0; 
        int min=prices[0]; 
        for(int i=1; i<prices.length; i++){
            int sell=0; 
            if(prices[i]<min){
                min=prices[i];
            }

            if(prices[i]>min){
                sell=prices[i]-min;
            }

            if(sell>profit){
                profit=sell; 
            }

        }

        return profit; 
    }
}
