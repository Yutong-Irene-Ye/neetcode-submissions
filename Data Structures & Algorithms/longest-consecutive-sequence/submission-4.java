class Solution {
    public int longestConsecutive(int[] nums) {
        // case 1 length of the input  =0
        if(nums.length==0){
            return 0; 
        }
        // case 2 length of the input is greater than one 
        // when we loop think about whether we need i and j 
        // or we only need to have i and i+1
        // why or why not we will use i and j
        // why or why not we will use i and i+1

        // after we seperate the case =0 now we have the max to be 1
        // if the length is 1 then the current and max are both 1 

        // [2,20,4,10,3,4,5]
        Arrays.sort(nums);
        // [2,3,4,4,5,10,20]
        int max=1;
        int count=1; 
        

        for(int i=1; i<nums.length; i++){
            
            // [2,3,4,4,5,10,20]
            // once the j compare ends we should exist the j inner loop and reset the count

            // what do we hope to have this loop do?
            // we want to increment the length by 1 if we see that the next num in the 
            // sequence is 1 greater thatn the previous num 
            // think about the edge cases 
            // what is in the list of int array?
            // we have input that is not sort
            // also in this unsorted array list we also could have duplicate numbers so 
            // so in this case how do we treat the duplciate number?
            //  i and j are two pointers 
            // if this doesn not work can we use 1 pointer only to get through the array?
            if(nums[i]==nums[i-1]){
                continue;
            }
            if((nums[i]-nums[i-1])==1){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count; 
            }    
        }
        return max; 

        //  there is error becuase we skip the check of the first num 

        
    }
}
