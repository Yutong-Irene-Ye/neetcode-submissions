class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        sorted_s=sorted(s)
        sorted_t=sorted(t)

        if sorted_s==sorted_t:
            return True
        return False 


        #method 2 I can sort them then compare the two sorted array 

        #method 3 I can use data strcture to store them as set for each one 

