class Solution {
    public int trap(int[] height) {

        int res=0; 

        for(int i=0; i<height.length; i++){
            int maxL=0; 
            int maxR=0; 

            for(int l=0; l<=i; l++){
                maxL=Math.max(maxL,height[l]);
            }

            for(int r=i; r<height.length; r++){
                maxR=Math.max(maxR, height[r]);
            }

            res+=Math.min(maxL, maxR)-height[i];
        }

        return res; 
        
    }
}
