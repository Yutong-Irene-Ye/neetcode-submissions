class Solution {
    public int findKthLargest(int[] nums, int k) {
        // A: keep the current list strcture and sort  - done 
        // B: Create an Array list and sort it from accending order
        // C: create an array list and sort it from decesnding order  
        // D: use a map /min or max heap strcture min heap to retrive the data     

        // Arrays.sort(nums); 
        // return nums[nums.length-k];understand why return this 

    //     List <Integer> res=new ArrayList<>(); 

    //     for(int num: nums){
    //         res.add(num); 
    //     }

    //     Collections.sort(res); 

    //     return res.get(res.size()-k);
    // }

    // imagine if we want to sort from the back using an Array as well 
    List <Integer> res=new ArrayList<>(); 

    for(int num:nums){
        res.add(num); 
    }

    Collections.sort(res); 

    int count=0; 
    for(int i=res.size()-1; i>=0; i--){
        count++; 
        if(count==k){
            return res.get(i); 
        }

    }

            return -1; 
    }
}
