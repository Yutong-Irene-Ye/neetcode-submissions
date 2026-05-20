class Solution {
    public boolean hasDuplicate(int[] nums) {
        // check if in the array there is duplicate using a Set 
        Set <Integer> seen=new HashSet<>(); 
        for(int i=0; i<nums.length; i++){
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }
        return false;

    }
}