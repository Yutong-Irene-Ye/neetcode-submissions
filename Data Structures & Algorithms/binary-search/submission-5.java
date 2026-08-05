class Solution {
    public int search(int[] nums, int target) {
        // initiate the start search postion 
        // initiate the last search postion 
        // also to define the mid point and move the mid point as we move the left and right pointer 
        // the point its to divide the array into half and compare the target with the mid point to know whcih half of the array we should look at 
        int l=0; 
        int r=nums.length-1; 

        while(l<=r){
            int mid=(l+r)/2; 
            if(target==nums[mid]){
                return mid; 
            }else if(nums[mid]<target){
                l=mid+1; 
            }else{
                r=mid-1; 
            }
        }
        return -1; 
        
    }
}
