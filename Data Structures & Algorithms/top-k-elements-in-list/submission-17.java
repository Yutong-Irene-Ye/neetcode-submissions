class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // first look atthe problem that we have array of int anf we want to return top k element
        // in order to do this we need to know how many time each element appear then we return the top K element either from sorting or from min heap 
        // we store {num, freq}
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        // now we want to use a minheap?
        // now in the heap we want to store {freq, num}, first we tell the pq how to sort the heap, min or max 
        PriorityQueue <int []> heap=new PriorityQueue<> ((a,b)->(a[0]-b[0])); 
        // next we just need to access the map to add the {freq, num} to the heap, look at how we create the map 
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            heap.offer(new int [] {entry.getValue(), entry.getKey()});

            if(heap.size()>k){
                heap.poll(); 
            }
        }

        // now remember what we need to get from the heap to put into the res list look at {freq:num} and we know that we need to return the num at[1]
        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[1];
        }

        return res; 
        
    }
}
