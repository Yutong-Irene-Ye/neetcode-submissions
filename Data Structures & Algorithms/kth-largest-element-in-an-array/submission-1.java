class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 2, 3, 1, 5, 4
        // 1, 2, 3, 4, 5
        // 2, 3, 1, 1, 5, 5, 4
        // 1, 1, 2, 3, 4, 5, 5 top 3?largest return 4
        // int his case we use a list and sort them
        
        // lets do a heap, priorty Queue

        // first try MaxHeap 
        PriorityQueue <Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(b, a)); 
        // [2,3,1,5,4], k = 2
        // now we put in into the heap structure, [5,4,3,2,1,]

        for(int num:nums){
            // what is offer 
            // offer = add 
            // after this step this is what we get [5,4,3,2,1,]
            //                                      1,2 we what 2 we need start loop at 1
            // now look at loop inde               [0,1,2,3,4]
            // lets see if k=2
            pq.offer(num); 
        }

        for (int i = 1; i < k ; i++) {
            pq.poll();
        }
            // after this part we have [5,4]
            // loop position           [0,1]

            return pq.peek(); 
        }


}
