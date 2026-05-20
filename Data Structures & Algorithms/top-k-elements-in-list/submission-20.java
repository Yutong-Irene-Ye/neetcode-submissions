class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // when we use the pq we need to know which ele we are sorting [0] or[1]
        PriorityQueue <int []> pq=new PriorityQueue<>((a,b)->a[0]-b[0]); 
        // now we need to access the map 
        for(Map.Entry <Integer, Integer> entry: freq.entrySet()){
            // look at how to initiate the pq to get an idea of how to add value to the pq
            pq.offer(new int [] {entry.getValue(), entry.getKey()});

            if(pq.size()>k){
                pq.poll(); 
            }
        }

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=pq.poll()[1];
        }
        return res; 

    }
}
