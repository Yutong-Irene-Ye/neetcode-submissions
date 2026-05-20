class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>(); 

        for(int i=0; i<nums.length; i++){
            seen.add(nums[i]);
        }

        if(nums.length==seen.size()){
            return false;
        }
        return true;

        
    }
}