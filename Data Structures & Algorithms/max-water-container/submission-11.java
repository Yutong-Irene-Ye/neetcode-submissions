class Solution {
    public int maxArea(int[] heights) {
        int i=0; 
        int j=heights.length-1; 
        int res=0; 

        while(i<j){
            int h=Math.min(heights[i], heights[j]); 
            int w=j-i; 
            int area=h*w; 

            if(area>res){
                res=area; 
            }

            if(heights[i]<heights[j]){
                i++; 
            }else{
                j--; 
            }
        }

        return res; 
        
    }
}
