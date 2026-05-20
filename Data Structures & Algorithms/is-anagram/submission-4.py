class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False 

            # we have two list s and t
        s_list=list(s)

        for c in t:
            for i in range(len(s_list)):
                if c==s_list[i]:
                    s_list.pop(i)
                    # found=True
                    break
            else:
                return False 
        return True 



        #method 2 I can sort them then compare the two sorted array 

        #method 3 I can use data strcture to store them as set for each one 

