class Solution {
    public int findKthLargest(int[] nums, int k) {
        // now we want to try to loop the kth element from the back 
        // notice that we have an unsorted array and we have tp return an array that has kth element and how do we know the order we must sort the array 
        // now state from the problem statement that we want the kth ele from the back 
        // so we can sumply loop from the bacl using i idx 
        // how do we know to stop counting from the back we can use a counter to keep track of the k count from the back 

        Arrays.sort(nums); 

        int count=0; 
        for(int i=nums.length-1;i>=0; i--){
            count++; 
            if(count==k){
                return nums[i]; 

            }
        }

        return -1; 
        
    }
}
