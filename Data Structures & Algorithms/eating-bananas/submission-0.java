class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=0; 

        for(int p:piles){
            maxPile=Math.max(p, maxPile); 
        }

        //remember what are we using binary search for speed not length 

        int l=1; 
        int r=maxPile; 

        while(l<=r){
            int speed=(l+r)/2; 
            int hour=0; 
            for(int i=0; i<piles.length; i++){
                
                hour+=((piles[i]+speed-1)/speed); 
            }

            if(hour<=h){
                r=speed-1; 
            }else{
                l=speed+1; 
            }
        }
        return l; 
        
    }
}
