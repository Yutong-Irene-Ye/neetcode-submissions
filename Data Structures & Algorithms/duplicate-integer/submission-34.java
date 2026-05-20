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
        // using a set will give us one loop big 0 N time 
        // Set <Integer> seen=new HashSet<>(); 

        // for(int i=0; i<nums.length; i++){
        //     if(seen.contains(nums[i])){
        //         // becuaseo if we check the num in the loop they already there meaning there is a duplicate and we will return inmmediatelu once we found the first duplicare 

        //         return true; 

        //     }
        //     // else the num is not in the set, have not seen it we need to store and mark it seen using the set 
        //     seen.add(nums[i]);

        // }
        // // if we skim through all the num in the array and not found any seen then we know if did contain the duplicate 
        // return false;

        // now we try to solve this problem using a Map 
        // but we need to remember that map store key value pair so we have to make sure we know the data type for the key and value store and make sure we include then when init also we need to add both when using put and know whether we are checking for the key or value 
        Map <Integer, Boolean> seen=new HashMap<>(); 

        for(int i=0; i<nums.length; i++){
            if(seen.containsKey(nums[i])){
                return true; 
            }
            seen.put(nums[i], true);
        }
        return false;
        
    }
}