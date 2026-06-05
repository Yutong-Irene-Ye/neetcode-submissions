class Solution {
    public int maxArea(int[] heights) {
        // when i=0; compare 1-6, if 1 is less than 6, we cal 1*1
        // when i=1; compare 7-6, if 6 is less than 7, we cal 6*6
        // when i=2; compare 2-6, if 2 is less than 6, we cal 2*2
        // when i=3; compare 5-6, if 5 is less than 6, we cal 5*5
        // when i=4; compare 4-6, if 4 is less than 6, we cal 4*4
        // when i=5; compare 7-6, if 6 is less than 7, we cal 6*6
        // when i=6; compare 3-6, if 3 is less than 6, we cal 3*3

        // AreaR=heigthh*width 
        // what is the height is the num array input = [1,7,2,5,4,7,3,6]
        // what is the width is the r-l, 

        int l=0; 
        int r=heights.length-1; 
        int max=0; 

        while(l<r){
            int w=r-l; 
            int height=Math.min(heights[l], heights[r]);
            int area=height*w;

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
