class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // step 1 
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // step 2 put the map K:V pair into the list to sort them 
        // int [] we get the outter [] 
        // we need to create brucket inside int []
        List <int []> list =new ArrayList<>(); 
        for(int key:freq.keySet()){
            list.add(new int []{key, freq.get(key)});
        }

        list.sort((a,b)->b[1]-a[1]);

        // now we need to add this into res 
        // only 1 [] 
        int [] res=new int [k];
        for(int i=0; i<k; i++){
            res[i]=list.get(i)[0];
        }

        return res; 
        
    }
}
