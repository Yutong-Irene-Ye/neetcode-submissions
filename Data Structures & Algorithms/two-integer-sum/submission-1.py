class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #given an array, we know we can use index to find anything 
        seen={} #use seen as dictionary to store the num and its index
        i=0
        for num in nums:
            complement=target-num #find the complement so we only loop through one num 
            if complement in seen:
                return [seen[complement],i] #if we found the num in seen, return the index of the complement and the current index of the num 
            seen[num]=i #if we didn't find the num, store the unseen num and its index in the seen 
            i+=1 #increment the counter to check the next num 
        
        