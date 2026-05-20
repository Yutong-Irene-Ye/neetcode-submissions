class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 
        # return sorted(s)==sorted(t)
        # use sorted is olog(n)
        freq_s={}
        freq_t={}

        for char in s: 
            if char not in freq_s:
                freq_s[char]=0
            freq_s[char]+=1
        
        for char in t: 
            if char not in freq_t:
                freq_t[char]=0
            freq_t[char]+=1
        
        return freq_s==freq_t
        #use dictionary is o(n) 
        #use dictionary because we need to keep track of the counts 

