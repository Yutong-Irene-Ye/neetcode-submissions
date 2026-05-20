class Solution {
    public int[] twoSum(int[] nums, int target) {
        // given an array list and return a sum which is the sum of the two num that adds up to a target 
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j}; 
            }
        }

        return new int[]{};

        
    }
}
