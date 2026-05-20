class Solution {
    public int findKthLargest(int[] nums, int k) {
        // decide on a data stucture : list of integer 
        List<Integer> res=new ArrayList<>(); 
        // add the list to the data stuture you choose
        // now we added the num to the list 
        for(int num:nums){
            res.add(num);
        }
        // next we need to sort the list 
        Collections.sort(res); 

        // after the sort we should return the Kth element

        int count=0; 

        for(int i=res.size()-1; i>=0 ; i--){
            count++; 
            if(count==k){
                return res.get(i);
            }  
        }
        return -1; 
    }
}