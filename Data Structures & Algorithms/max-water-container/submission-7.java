class Solution {
    public int maxArea(int[] heights) {
        int l=0; 
        int r=heights.length-1; 
        int max=0; 

        while(l<r){
            // we start looping from l to r, where l is the start of the array at 0
            // right is the endof the array length-1
            // then each time we have a new h or l we calculate the area 
            // then compare the curren area to the current 
            int h=Math.min(heights[r],heights[l]); 
            int w=r-l; 
            int area=h*w; 

            // get the area of each wifth and height
            // how to get the max area by using the two pointer mathod?
            // we can compare the l and r pointer and move the pointer that 
            // if the goal its mx the area we should move the pointer toward the larger height
            // which is heights[l] and heights[r]

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
