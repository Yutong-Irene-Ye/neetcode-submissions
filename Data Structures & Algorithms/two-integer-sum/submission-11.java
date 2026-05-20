class Solution {
    public int[] twoSum(int[] nums, int target) {
        // init a hashmap call seen and allocate memoery for it
        // {num:i} {key: value} what is store in the map 
        // {complement: i} {key: value} what we use to loop up in the map, if complement match the num in the map we will return the position.inde of the num that we seen 

        Map<Integer, Integer> seen=new HashMap<>(); 

        for(int i=0; i<nums.length; i++){
            int complement=target-nums[i]; 
            if(seen.containsKey(complement)){
                return new int []{seen.get(complement), i};
            }
            seen.put(nums[i], i); 
        }
        return new int []{}; 
        
    }
}
