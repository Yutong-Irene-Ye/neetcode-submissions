class Solution {
    public int search(int[] nums, int target) {
        // how to solve this problem using binary search 
        int l=0; 
        int r=nums.length-1; 
        int res=-1; 

        while(l<=r){
            int mid = l + (r - l) / 2;

            if(nums[mid]==target){
                res=mid; 
                break; 
            }

            if(nums[mid]<target){
                l=mid+1; 
            }
            if(nums[mid]>target){
                r=mid-1; 
                
            }
        }
        return res; 
        
    }
}
