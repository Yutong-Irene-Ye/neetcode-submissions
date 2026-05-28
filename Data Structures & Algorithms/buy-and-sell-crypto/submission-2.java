class Solution {
    public int maxProfit(int[] prices) {
        int res=0; 
        //we do not want min to get reset inside the loop 
        int min=prices[0];

         

        for(int i=0; i<prices.length; i++){
            
            // check if we already seen min 
            // then cal culculate each max-min, and use max to store 
            if(prices[i]<min){
                min=prices[i]; 
            }else{
                res=Math.max(res, (prices[i]-min));
            }
        } 

        return res;        
    }
}
