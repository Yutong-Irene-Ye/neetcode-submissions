class Solution {
    public int maxProfit(int[] prices) {
        // here the key to solve this probelm is that 
        // we assume the first num is the min 

        // reember that we are return a num that represent the max profit 
        int res=0; 
        int min=prices[0]; 

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i]; 
            }else{
                res=Math.max(res,(prices[i]-min));
            }
        }
        return res; 
        
    }
}
