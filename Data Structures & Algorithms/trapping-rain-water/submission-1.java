class Solution {
    public int trap(int[] height) {
        // now solve this problem for using two pointers 
        if(height==null||height.length==0){
            return 0; 
        }

        int l=0; 
        int r=height.length-1; 
        int maxL=height[l]; 
        int maxR=height[r]; 

        int res=0; 

        // remember that we are using a to pointers 
        while(l<r){
            if(maxL<maxR){
                l++; 
                maxL=Math.max(height[l], maxL); 
                res+=maxL-height[l]; 
            }else{
                r--; 
                maxR=Math.max(height[r], maxR); 
                res+=maxR-height[r]; 
            }
        }
        return res; 
        
    }
}
