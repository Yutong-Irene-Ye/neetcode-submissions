class Solution {
    public int search(int[] nums, int target) {
        // search got target in nums
        // return -1 if not found 
        // the solution must be in 0logn
        int a=-1; 

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                a=i; 
            }
        }
        return a; 
        
    }
}
