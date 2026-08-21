class Solution {
    public int findMin(int[] nums) {
        int res=nums[0]; 
        for(int num:nums){
            if(num<res){
                res=num; 
            }
        }
        return res; 
        
    }
}
