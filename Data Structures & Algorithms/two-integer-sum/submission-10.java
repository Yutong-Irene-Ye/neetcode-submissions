class Solution {
    public int[] twoSum(int[] nums, int target) {
        // try solve this using a set
        // try solve this using sort and two pointers 
        Map<Integer, Integer> seen=new HashMap<>(); 

        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i]; 
            if(seen.containsKey(complement)){
                return new int[]{seen.get(complement),i};
            }
            seen.put(nums[i],i);
        }
        return new int []{};  
        
    }
}
