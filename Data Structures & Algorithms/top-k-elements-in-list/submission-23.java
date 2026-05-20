class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // now we want to solve this using the sorted list 
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        List<int []> array=new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            array.add(new int [] {entry.getValue(), entry.getKey()});
        }

        array.sort((a,b)->Integer.compare(b[0], a[0])); 

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=array.get(i)[1];
        }
        
        return res; 
    }
}
