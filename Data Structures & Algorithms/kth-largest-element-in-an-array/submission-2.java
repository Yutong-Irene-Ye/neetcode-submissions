class Solution {
    public int findKthLargest(int[] nums, int k) {
        List <Integer> res=new ArrayList<>(); 

        for(int num:nums){
            res.add(num); 
        }
        res.sort((a,b)->(a-b));

        Collections.sort(res); 

        return res.get(res.size()-k);
        
    }
}
