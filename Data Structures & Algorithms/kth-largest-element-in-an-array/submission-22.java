class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(); 
        // create struture 
        // add it to the strcture 
        // so in heap
        // parent<=child we are ok no sweap 
        // if parent>child we will sweap upward, Repeat until heap property is satisfied

        // example [2,3,1, 1, 5,5,4]
        // step 1: 
        //  [2]
        // [3][1]
        //   || now heapify up 
        //  [1]
        // [3][2]

        // step 2: add 1
        //  [1]
        // [3][2]
        // [1]
        //    ||
        //   [1]
        // [1][2]
        // [3]

        // step 3: add 5
       //    ||
        //   [1]
        // [1][2]
        // [3] [5] 


        for(int num:nums){
            pq.offer(num);  

            if(pq.size()>k){
                // we remove the root parent 
                pq.poll(); 
            }       
        }

        return pq.peek(); 

        
    }
}
