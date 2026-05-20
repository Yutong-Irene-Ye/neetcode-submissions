class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        nums.sort()
        best=1
        current=1

        for i in range(1, len(nums)):
            #we need to skip the duplicates 
            if nums[i]==nums[i-1]:
                continue 
            if nums[i]==nums[i-1]+1:
                current+=1
            else:
                current=1
            best=max(best, current)
        return best 
        