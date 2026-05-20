class KthLargest {
    int K; 
    ArrayList<Integer> arr; 

    public KthLargest(int k, int[] nums) {
        K=k;
        arr=new ArrayList(); 
        for(int num:nums){
            arr.add(num);
        }


        
    }
    
    public int add(int val) {
        // what return type I want? 
        // hwat is the data type of the arr object?
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-K);
        
    }
}
