class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m=new HashMap<>(); 

        for(int i=0; i<nums.length; i++){
            int d=target-nums[i]; 
            // if we have seem the num and stored it, found, return 
            if(m.containsKey(d)){
                return new int [] {m.get(d), i}; 
                // if we have not seen the num we will not add it to the map 
            }else{
                m.put(nums[i], i); 
            }
        }
        return new int []{}; 
        
    }
}
