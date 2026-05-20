class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        List <int []> list =new ArrayList<>(); 
        for(int key:freq.keySet()){
            list.add(new int [] {freq.get(key),key});
        }    

        list.sort((a,b)->(b[0]-a[0]));

        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=list.get(i)[1];
        }

        return res; 
    }
}
