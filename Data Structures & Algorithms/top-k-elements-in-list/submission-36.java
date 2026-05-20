class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<int []> heap=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0])); 
        for(int key:freq.keySet()){
            heap.offer(new int []{freq.get(key),key});

            if(heap.size()>k){
                heap.poll(); 
            }
        }

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[1];
        }

        return res; 

    }
}
