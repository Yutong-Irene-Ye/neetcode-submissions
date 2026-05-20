class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> res=new PriorityQueue<>(); 

        for(int num:nums){
            res.offer(num); 
            // here we default it to be minheap 
            //  here we can add num until we reach the len>1, then we start to remove from the root node st the top 
            if(res.size()>k){
                res.poll();
            }
        }

        return res.peek(); 
        
    }
}
