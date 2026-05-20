class Solution {
    public int findKthLargest(int[] nums, int k) {
        // A: keep the current list strcture and sort 
        // B: Create an Array list and sort it from accending order
        // C: create an array list and sort it from decesnding order  
        // D: use a map /min or max heap strcture min heap to retrive the data     
        Arrays.sort(nums); 
        return nums[nums.length-k];
    }
}
