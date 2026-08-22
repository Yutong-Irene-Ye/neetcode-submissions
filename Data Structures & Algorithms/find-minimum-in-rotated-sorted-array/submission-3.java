class Solution {
    public int findMin(int[] nums) {
        // the goal its to find the min num of the array 
        int res=nums[0]; 

        int l=0; 
        int r=nums.length-1; 

        while(l<=r){
            if(nums[l]<=nums[r]){
                res=Math.min(res, nums[l]); 
                break; 
            }

            int mid=(l+r)/2; 
            res=Math.min(res, nums[mid]);
            if(nums[mid]>=nums[l]){
                l=mid+1; 
            }else{
                r=mid-1; 
            }
        }

        return res; 


        
    }
}
