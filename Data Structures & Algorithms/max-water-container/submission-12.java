class Solution {
    public int maxArea(int[] heights) {

        int res=0; 

        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                // height=math.min(height[j],height[i])
                // w==j-i
                // Max_area=Math.max(area)=h*w
                res=Math.max(res, (Math.min(heights[i], heights[j])*(j-i)));

            }

            
        }
        return res; 
        
    }
}
