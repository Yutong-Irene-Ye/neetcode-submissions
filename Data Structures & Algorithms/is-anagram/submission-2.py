class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # if len(s) != len(t):
        #     return False 
        # # return sorted(s)==sorted(t)
        # # use sorted is olog(n)
        # freq_s={}
        # freq_t={}

        # for char in s: 
        #     if char not in freq_s:
        #         freq_s[char]=0
        #     freq_s[char]+=1
        
        # for char in t: 
        #     if char not in freq_t:
        #         freq_t[char]=0
        #     freq_t[char]+=1
        
        # return freq_s==freq_t
        # #use dictionary is o(n) 
        # #use dictionary because we need to keep track of the counts 

        #noe we are given two strings s and t these are to array of strings
        #now we want to know if string of s consist of the same string of t ?

        #method 1 i can loop and compare each letter in the two string 
        if len(s)!=len(t):
            return False

        if sorted(s)==sorted(t):
            return True 
        return False  


        #method 2 I can sort them then compare the two sorted array 

        #method 3 I can use data strcture to store them as set for each one 

