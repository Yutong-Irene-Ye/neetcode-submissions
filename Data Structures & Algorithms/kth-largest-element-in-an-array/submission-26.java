class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> res=new PriorityQueue<>(); 

        // here we want to use min heap 
        for(int num:nums){
            res.offer(num); 

            if(res.size()>k){
                res.poll(); 
            }
        }

        return res.peek(); 


        
    }
}
