class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq=new HashMap<>(); 

        for(int num:nums){
            // we are dealing with map here so we have to use put 
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        List<int []> arrayInt=new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            arrayInt.add(new int [] {entry.getValue(), entry.getKey()});
        }

        arrayInt.sort((a,b)->Integer.compare(b[0], a[0])); 
        
        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=arrayInt.get(i)[1];
        }
        return res; 
    }
}
