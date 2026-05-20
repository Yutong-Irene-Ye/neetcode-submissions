class Solution {
    public boolean hasDuplicate(int[] nums) {
        // nested for loop 
        // HashSet
        // HashMap
        // Sorting 
        // Hashset Length????

        // for(int i=1; i<nums.length; i++){
        //     for(int j=i-1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // //exit the for loop
        // return false;

        // now we want to use the sorting 
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;

        
    }
}