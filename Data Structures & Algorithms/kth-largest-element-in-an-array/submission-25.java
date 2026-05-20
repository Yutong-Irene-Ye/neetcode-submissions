class Solution {
    public int findKthLargest(int[] nums, int k) {
        // first how do we solve this problem use waht?
        //max heap we have to arrange it from b-b
        PriorityQueue<Integer> res=new PriorityQueue<>((a,b)->(b-a)); 

        // now we add to the queue 
        for(int num:nums){
            res.offer(num); 
        }

        // after we finish adding. we then pop from the top 
        // here we use k-1 becuase we want to keep kth largest, we 
        // let say k=2, we remove k-1, which is to remove 1 largest to leave k largest 
        // lets say k=1, we remov k-1=0, we do not need to remove 
        for(int i=0; i<k-1; i++){
            res.poll(); 
        }

        return res.peek(); 
        
    }
}
