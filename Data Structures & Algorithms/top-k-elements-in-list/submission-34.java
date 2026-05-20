class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // method 2 priority queue we do not need to sort 
        // thus do now need to convert a map into list 
        // please also note that java default to min heap
        // a min heap means that the min num occurencs on the root
        //  also remember that one of the property of the heap is that the child is greater than or equal to the parent in a min heap 


        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0])); 
        
        for(int key: freq.keySet()){
            heap.offer(new int [] {freq.get(key), key});
        
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
