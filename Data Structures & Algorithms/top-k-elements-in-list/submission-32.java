class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // create we can not sort the map
        // input [1,2,2,3,3,3]
        Map<Integer, Integer> freq=new HashMap<>(); 
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        //however we can  sort the list 
        // how to implement a sorted list 
        // first add each [k:v] to the list 
        // {[1:1]
        //   [2:2]
        //    [3:3]}
        // [[1:1][2:2][3:3]]
        List <int []> list=new ArrayList<>(); 
        for(int key:freq.keySet()){
            list.add(new int []{key, freq.get(key)});
        }

        list.sort((a,b)->b[1]-a[1]);

        int [] res=new int [k];
        for(int i=0; i<k; i++){
            res[i]=list.get(i)[0];
        }

        return res; 

        
    }
}
