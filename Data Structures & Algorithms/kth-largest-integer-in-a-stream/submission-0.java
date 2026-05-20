class KthLargest {
    int k; 
    ArrayList<Integer>arr; 


    public KthLargest(int k, int[] nums) {
        this.k=k; 
        arr=new ArrayList<>();
        for(int num:nums){
            arr.add(num);
        }
        
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-k);
        
    }
}
