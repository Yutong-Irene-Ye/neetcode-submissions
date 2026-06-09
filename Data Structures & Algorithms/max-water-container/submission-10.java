class Solution {
    public int maxArea(int[] heights) {
        // here if we are to use two pointers 

        int res=0; 

        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                // (j-i) is the width * height 
                res=Math.max(res,(j-i)*Math.min(heights[i], heights[j]));

            }
        }

        return res; 
        
    }
}
