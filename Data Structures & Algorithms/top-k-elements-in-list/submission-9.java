class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1)create a map to store the freq:num key-value pairs 
        // 1a) first step its to allocate memoery for the map
        Map<Integer, Integer> freq=new HashMap<>(); 
        // 1b) second step its to loop through the int [] num and put it to the map
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        // 2) create a list if int [] freq:num value-key pair so we can do the sorting 
        List <int []> pair=new ArrayList<>(); 
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            pair.add(new int []{entry.getValue(), entry.getKey()});
        }
        // sort the list but its freq
        pair.sort((a,b)->Integer.compare(b[0], a[0]));

        // 3) allocate memoery to store the result list paris, so we can get the num from the sorted list and store it to the int result list 
        int [] res=new int [k]; 
        for(int i=0; i<k; i++){
            res[i]=pair.get(i)[1];
        }

        return res; 

        
    }
}
