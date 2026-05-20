class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> count=new HashMap<>(); 
        for(int i=0; i<nums.length; i++){
            int remain=target-nums[i]; 
            if(count.containsKey(remain)) return new int []{count.get(remain),i};
            count.put(nums[i],i);
        }

        return new int []{}; 
        
    }
}
