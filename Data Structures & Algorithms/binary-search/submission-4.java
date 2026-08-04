class Solution {
    public int search(int[] nums, int target) {
        // initiate the answer to the default value which is -1; 
        int a=-1; 
        int l=0; 
        int r=nums.length-1; 

        // we want to use a while lopo to keep moving the pointers 
        // make sure that we use less than and euqal to r, 
        // otherwise we are going to skip the last element 
        while(l<=r){
            int mid=(l+r)/2; 
            if(nums[mid]==target){
                a=mid; 
                break; 
            }else if(nums[mid]<target){
                l=mid+1; 
            }else{
                r=mid-1; 
            }

        }
        return a; 
        
    }
}
