class KthLargest {
    int a; 
    ArrayList<Integer> b; 

    public KthLargest(int k, int[] nums) {
        a=k; 
        b=new ArrayList(); 
        for(int num:nums){
            b.add(num); 
        }

        
    }
    
    public int add(int val) {
        b.add(val); 
        Collections.sort(b); 
        return b.get(b.size()-a);
        
    }
}
