class Solution {
    public int[] productExceptSelf(int[] nums) {
        // we need a data strcture to return the int list
        // if the input size is known we can use a fix size array 
        int [] res=new int [nums.length];
        for(int i=0; i<nums.length; i++){
            // we need to set prod tp 1 due the this is multi if we mul zero it will give us back zero 
            int prod=1;
            for(int j=0; j<nums.length; j++){
                // check j if i = self we need to skip 
                if(i!=j){
                prod*=nums[j];
                }
 
            }
            // now at each i position we need to add the result to the res int list 
            res[i]=prod; 
        }
        return res; 
        
    }
}  
