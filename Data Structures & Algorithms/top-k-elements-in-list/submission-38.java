class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        // use heap, priority queue 
        PriorityQueue<int []> heap=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int key:freq.keySet()){
            heap.offer(new int [] {key, freq.get(key)});

            if(heap.size()>k){
                heap.poll(); 
            }
        } 

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[0];
        }

        return res;

        
    }
}
