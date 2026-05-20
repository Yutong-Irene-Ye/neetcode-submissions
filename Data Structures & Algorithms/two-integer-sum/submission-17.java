class Solution {
    public int[] twoSum(int[] nums, int target) {
        // now also think about how you would solve this problem using 
        // now we want to use a hash map to store the num and the postiotion i
        // now notice we only need 1 set and does not need it to be reset 
        Map<Integer, Integer> count=new HashMap<>(); 
        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i]; 
            if(count.containsKey(complement)){
                // at this step 
                // you need to clarify if the order of which index got return matters 
                return new int [] {count.get(complement), i};
            }
            count.put(nums[i],i);
        }

        return new int []{}; 
        
    }
}
