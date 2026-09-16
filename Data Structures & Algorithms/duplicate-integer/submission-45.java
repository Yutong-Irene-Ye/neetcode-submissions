class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ums = [1, 2, 3, 3]
        Arrays.sort(nums); 
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<=nums.length-1; j++){
                if(nums[i]==nums[j]){
                    return true; 
                }
            }
        }
        return false; 
        
    }
}