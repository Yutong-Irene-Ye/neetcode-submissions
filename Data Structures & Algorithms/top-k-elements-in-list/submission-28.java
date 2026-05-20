class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count=new HashMap<>(); 
        for(int num:nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        List<int []> list=new ArrayList<>(); 
        for(int key:count.keySet()){
            list.add(new int []{key, count.get(key)});
        }

        list.sort((a,b)->b[1]-a[1]);

        int []res=new int[k]; 
        for(int i=0; i<k; i++){
            res[i]=list.get(i)[0];
        }

        return res;
        
        
    }
}
