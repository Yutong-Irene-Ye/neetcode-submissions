class Solution {
    public int findKthLargest(int[] nums, int k) {
        // now we can try to use the original list and loop from the back 
        Arrays.sort(nums); 

        int count=0; 
        for(int i=nums.length-1; i>=0; i--){
            count++; 
            if(count==k){
                return nums[i]; 
            }
         
        }
           return -1; 
        
    }
}
