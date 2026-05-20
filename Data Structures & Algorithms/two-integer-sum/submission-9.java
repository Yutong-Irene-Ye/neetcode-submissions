class Solution {
    public int[] twoSum(int[] nums, int target) {
        // method 1
        // use two for loop one point to the start of the array 
        // anther loop which is the iner loop tp loop thgouh every other pair in the array 
        // method 2 
        // this is the nessted for loop method
        // annother mathod its wo create two map with key storing the num and value store the index of the num 
        // then we create a complement variable to mark the num we need to sun to the target at each looping positions
        // then use the map to store the position 
        // method 3 
        // now we can also try to sort the array then use the two pointer techniqe to find the num we need 
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int []{i,j};
                }
            }
            // exist the for loop then return 
            
        }  
        return new int []{};  
    }
}
