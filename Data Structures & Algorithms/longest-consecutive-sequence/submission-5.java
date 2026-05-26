class Solution {
    public int longestConsecutive(int[] nums) {
        // case 1 length =0
        if(nums.length==0){
            return 0; 
        }

        Arrays.sort(nums);

        int max=1; 
        int count=1; 

        // case 2 length=1 or greater 

        for(int i=1; i<nums.length; i++){
            // [2,20,4,10,3,4,5]
            // [2,3,4,4,5,10,20]
            // 
            // case 1: duplicate 
            if(nums[i]==nums[i-1]){
                continue; 
            }

            // case 2: i+1 yes 
            if(nums[i]==(nums[i-1]+1)){
                count++;
                // case 3: i+1 no
            }else{
                count=1;
            }

            if(count>max){
                max=count;
            }
            
        }

        return max; 


        
    }
}
