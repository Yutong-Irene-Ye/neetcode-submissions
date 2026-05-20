class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen=set() #this is creating a map to store the list of element 
        for num in nums: #loop though each num in the number list 
            if num in seen: #check if the num is in the seen container 
                return True #if yes return true for finding the duplicate 
            else:
                seen.add(num) #else num not seen so add it to the seen 
        return False #and return false that we haven no seen the num
         