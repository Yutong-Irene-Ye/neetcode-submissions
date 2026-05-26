class Solution {
    public int longestConsecutive(int[] nums) {
        // if length=0
        if(nums.length==0){
            return 0; 
        }

        Arrays.sort(nums);

        int max=1; 
        int count=1; 

        // if length ==1 and greater than 1 
        for(int i=1; i<nums.length; i++){
            // case 1, duplicate
            if(nums[i]==nums[i-1]){
                continue;
            }
            // case 2, next nums is num+1
            if(nums[i]==(nums[i-1]+1)){
                count++; 
            }else{
                count=1;
            }

            if(count>max){
                max=count;
            }

            // case 3, next nums is not num+1
        }

        return max; 


        
    }
}
