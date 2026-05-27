class Solution {
    public int longestConsecutive(int[] nums) {
        
        // solve this problem use a list and sort
        // the problem ask us to return length of the array
        // case 1 length=0
        // case 2 length=1,and greater than 1 
        if(nums.length==0){
            return 0; 
        }
        // [2,20,4,10,3,4,5]
        Arrays.sort(nums); 
        // [2,3,4,4,5,10,20]

        // where should you keep the count and streak? 
        // I want the count and streak to reset once we exost the loop
        // so inside the loop we need to have a res to keep count of the max count 

        // count must ne one because we already exclude the case that length can be 0 
        int res=1; 
        int count=1; 
        // also be flexible in where to start the array. no always 0 
        for(int i=1; i<nums.length; i++){
            // case 1 duplciate 
            if(nums[i]==nums[i-1]){
                continue; 
            }
            // case 2 yes i+1=num[i]+1
            if(nums[i]==(nums[i-1]+1)){
                count++; 
            }else{
                count=1; 
                // case 3 all the other cases we should reset the count 
            }

            if(count>res){
                res=count; 
            }

            }

            return res; 

    
        
    }
}
