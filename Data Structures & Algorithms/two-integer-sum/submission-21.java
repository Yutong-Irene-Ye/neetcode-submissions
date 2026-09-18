class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m=new HashMap<>(); 
        for(int i=0; i<nums.length; i++){
            int d=target-nums[i]; 
            if(m.containsKey(d)){
                return new int [] {m.get(d), i}; 
            }else{
                m.put(nums[i], i); 
            }
        }
        return new int [] {}; 
        
    }
}
