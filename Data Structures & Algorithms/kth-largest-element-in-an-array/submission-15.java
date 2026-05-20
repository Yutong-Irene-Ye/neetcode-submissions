class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 

        //  now we want to try to loop through this list from the back using for loop 
        int count=0; 
        for(int i=0; i<nums.length; i++){
            count++; 
            if(count==nums.length-k+1){
                return nums[i]; 
            }
            
        }

        return -1; 
        
    }
}
