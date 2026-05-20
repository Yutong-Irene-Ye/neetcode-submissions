class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); 
        // input   [2,3,1,5,4]
        //          0     4 
        //   after the sort 
        //         [1,2,3,4,5]
        //  idx     0,1,2,3,4
        //  les say k=1, len 5 we have 5-1=4
        // les say k=5, len 5 we have 5-5=0 this is correct 

        return nums[nums.length-k]; 
        
    }
}
