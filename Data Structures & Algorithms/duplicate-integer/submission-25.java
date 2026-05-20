class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
            // return true if duplcate, false otherwise 
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}