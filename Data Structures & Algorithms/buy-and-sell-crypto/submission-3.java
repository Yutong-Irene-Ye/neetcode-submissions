class Solution {
    public int maxProfit(int[] prices) {
        int profit=0; 
        // the ideas of buying or selling store 
        // we only sell then the next proce is greater that everything we seen since day one 
        // so we need to record every min since the fisrt day i
        // if the next day is less than the previous day we should keep track of that min by updating the 
        // the track is not only to keep track of the lowest buying point
        // but also to track that is the lowest but also the max we will seen int he next price poinr 
        int buy=prices[0];
        for (int i=0; i<prices.length; i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if(profit<(prices[i]-buy)){
                profit=(prices[i]-buy); 
            }
        }

        return profit; 
        
    }
}
