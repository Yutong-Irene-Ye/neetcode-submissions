class Solution {
    public int findKthLargest(int[] nums, int k) {
        // try to solve this problem with heap 
        // by default java use min heap 
        PriorityQueue<Integer> res=new PriorityQueue<>(); 

        // now that I create the data stcture I need to add the num onto the data strcture 
        // when we add to the data using loop think about wheterh we need the idx 
        // if not use simple strcture 
        for(int num:nums){
            res.offer(num); 

            // we need to pop the min as we get close to the len
            if(res.size()>k){
                res.poll(); 
            }
        }

        return res.peek(); 

        // now we do not have to sort the array b/c heap does it autometically

        
    }
}
