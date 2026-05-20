class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1); 
        }

        List<int []> arrayInt=new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> pair:freq.entrySet()){
            arrayInt.add(new int [] {pair.getValue(), pair.getKey()});
        }

        arrayInt.sort((a,b)->Integer.compare(b[0],a[0]));

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=arrayInt.get(i)[1];
        }

        return res;
        
    }
}
