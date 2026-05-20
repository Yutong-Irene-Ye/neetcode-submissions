class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> res=new HashMap<>(); 
        for(int num:nums){
            res.put(num, res.getOrDefault(num, 0)+1); 
        }

        List <int []> count=new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> freNum: res.entrySet()){
            count.add(new int [] {freNum.getValue(), freNum.getKey()});
        }
        
        count.sort((a,b)->(b[0]-a[0]));

        int [] fre=new int [k]; 
        for(int i=0; i<k; i++){
            fre[i]=count.get(i)[1];
        }

        return fre; 
    }
}
