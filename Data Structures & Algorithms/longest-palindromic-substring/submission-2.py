class Solution:
    def longestPalindrome(self, s: str) -> str:
        #think about what we are returning 
        #we are looking for the max len and keeping track of it 
        maxLen=0
        #keep track of the first letter of the maxIndex 
        maxIndex=0 

        for i in range(len(s)):
            left=i
            right=i
            while left>=0 and right<len(s) and s[left]==s[right]:
                currentLen=right-left+1
                if currentLen>maxLen:
                    maxLen=currentLen
                    maxIndex=left
                left-=1
                right+=1
        for i in range(len(s)-1):
            left=i
            right=i+1
            while left>=0 and right<len(s) and s[left]==s[right]:
                currentLen=right-left+1
                if currentLen>maxLen:
                    maxLen=currentLen
                    maxIndex=left
                left-=1
                right+=1
        return s[maxIndex:maxIndex+maxLen]



