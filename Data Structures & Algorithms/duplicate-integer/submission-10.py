class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #method 1, double for loop
        #pick 1 element nums[i]
        # for i in range(len(nums)):
        #     #compare to each subsequent element nums[j] where i<j
        #     for j in range(i+1, len(nums)):
        #         #inside the loop to reset the loop each time we need to 
               
        #         if nums[i]==nums[j]:
        #             return True 
        # return False 

        #method 2, sorting 

        #method 3, using a set 
        # seen=set() 
        # for n in nums: 
        #     if n in seen:
        #         return True
        #     else:
        #         seen.add(n)
        # return False 
        seen=set() 
        for i in range(len(nums)):
            if nums[i] in seen:
                return True 
            seen.add(nums[i])
        return False 


