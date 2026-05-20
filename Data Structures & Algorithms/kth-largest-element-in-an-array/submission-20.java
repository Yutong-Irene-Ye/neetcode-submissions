class Solution {
    public int findKthLargest(int[] nums, int k) {
        // now we can try top build an Array list of int to solve this problem 
        // if we want to use array list to solve this problem 
        // we then have to add the num from the list to the array list 
        List<Integer> res=new ArrayList<>(); 

        for(int num:nums){
            res.add(num); 
        }

        Collections.sort(res); 

        // once we sorted and add the array we then can return the num at len-k postion 
        return res.get(res.size()-k);
        
    }
}
