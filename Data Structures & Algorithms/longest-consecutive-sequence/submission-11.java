class Solution {
    public int longestConsecutive(int[] nums) {
        int res=0;

        // we can use a set to store all the nums in this num array 
        // after we store it we can check if the next curre+1 num exist in the set 
        // and as we are using the set we removed the duplated and can use o(1)lookup 
        Set<Integer> set=new HashSet<>(); 
        for(int num:nums){
            set.add(num); 
        }

        for(int num:nums){
            int streak=0; 
            int current=num; 
            while(set.contains(current)){
                streak++; 
                current++; 
            }

            if(streak>res){
                res=streak; 
            }
        }
        return res; 
        
    }
}
