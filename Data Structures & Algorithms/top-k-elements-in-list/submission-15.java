class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // store num:freq
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // if we do a-b we will have a min heap?
        // now we need to convert map into heap? why? becuase in heap we can sort it such as reorder the list to be minheap 
        // if this is the case we can remove anything on top of the heap thats greater than K elements, 

        // store:freq: num and we sort by the freq which is the a[0]
        PriorityQueue <int []> heap= new PriorityQueue <>((a,b)->a[0]-b[0]); 
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            heap.offer(new int [] {entry.getValue(), entry.getKey()});
        if(heap.size()>k){
            heap.poll();
        }

        }

        // retrive freq:num, here we want to store and return the num which is the a[1]
        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[1];
        }

        return res; 
        
    }
}
