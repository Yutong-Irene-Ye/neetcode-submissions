class Solution {
    public int longestConsecutive(int[] nums) {
        // case 1 length=0
        if(nums.length==0){
            return 0; 
        }
        // case 2 length=1, >1

        Arrays.sort(nums); 
        int count=1; 
        int max=1; 

        for(int i=1; i<nums.length; i++){
            // case 1: duplicate
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==(nums[i-1]+1)){
                count++;
            }else{
                count=1;
            }

            if(count>max){
                max=count;
            }

            // case 2: if i=i+1, count++
            // case 3: if i!=i+1, count=1 reset 
        }

        return max;

        
    }
}
