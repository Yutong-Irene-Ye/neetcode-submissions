class Solution {
    public int longestConsecutive(int[] nums) {
        // case 1 length=0
        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums); 
        // case 2 already cover case other than 0; which is 1 and more than 1 
        // the least case is 1 
        int max=1; 
        int count=1;

        // case 2 length>=1; 
        for(int i=1; i<nums.length; i++){
            // case 1:
            // duplicate
            if(nums[i]==nums[i-1]){
                continue;
            }

            // case 2:
            // i=i+1
            if(nums[i]==(nums[i-1]+1)){
                count++;
            // case 3
            // i!=i+1, this is else
            }else{
                // reset 
                count=1;
            }

            if(count>max){
                max=count;
            }

        }
        return max;
        
    }
}
