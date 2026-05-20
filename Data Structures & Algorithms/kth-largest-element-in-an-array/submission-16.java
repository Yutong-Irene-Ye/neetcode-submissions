class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 

        for(int i=0; i<nums.length; i++){
            if(i==nums.length-k){
                return nums[i]; 
            }
        }
        return -1;
        
    }
}
