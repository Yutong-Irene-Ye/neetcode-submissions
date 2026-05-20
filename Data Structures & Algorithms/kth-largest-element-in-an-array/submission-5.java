class Solution {
    public int findKthLargest(int[] nums, int k) {
        // sort the nums and return the kth 
        List<Integer> res=new ArrayList<>(); 
        for(int num:nums){
            res.add(num); 
        }
        Collections.sort(res); 
        return res.get(res.size()-k);

        
    }
}
