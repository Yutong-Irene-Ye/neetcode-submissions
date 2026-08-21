class Solution {
    public int findMin(int[] nums) {
        int res=nums[0]; 
        for(int num:nums){
            res=Math.min(num,res); 
        }
        return res; 
        
    }
}
