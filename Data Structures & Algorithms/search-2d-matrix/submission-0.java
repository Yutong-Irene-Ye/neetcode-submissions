class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // first lets traverse the row
        // let first think about how this matric is represent in rc
        // 0,0 0,1 0,2 0,3
        // 1,0 1,1 1,2 1,3
        // 2,0 2,1 2,2 2,3 
        // [0,i]
        int rLen=matrix.length; 
        int cLen=matrix[0].length; 

        for(int r=0; r<rLen; r++){
            for(int c=0; c<cLen; c++){
                if(matrix[r][c]==target){
                    return true; 
                }
            }
        }
        return false; 
    }
}
