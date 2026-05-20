class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums: 
            return 0
        # Given a sorted array 
        # the goal is to remove the duplicate from the sorted array 
        # so that each element only appears once, but the questions is which duplicate to keep ?
        # return the number of unqiue number donated by k 
        # please use the two pointer approach c

        if len(nums)==0: 
            return 0
        counter=1
        for i in range(1, len(nums)): 
            if nums[i]!=nums[i-1]: 
                nums[counter]=nums[i]
                counter+=1
        return counter 


        