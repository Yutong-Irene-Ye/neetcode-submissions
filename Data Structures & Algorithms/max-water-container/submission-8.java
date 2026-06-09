class Solution {
    public int maxArea(int[] heights) {
        // appoach 1: 
        // get the total area and shrink the area from the ourside 
        int l=0; 
        int r=heights.length-1; 
        // we not only wants the area but we want to get the max area, which we can get loop through each area and keep the max 
        // each time we seen the are 
        int max=0; 

        while(l<r){
            // each time we are inside the loop and we point at one position we are going to do the following math cal 
            int w=r-l; 
            int h=Math.min(heights[l], heights[r]); 
            int area=w*h; 

            if(area>max){
                max=area;
            }

            if(heights[l]<heights[r]){
                l++; 
            }else{
                r--; 
            }

        }

        return max; 

        
    }
}
