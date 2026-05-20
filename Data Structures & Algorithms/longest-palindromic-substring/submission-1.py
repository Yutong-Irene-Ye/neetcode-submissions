class Solution:
    def longestPalindrome(self, s: str) -> str:
        maxLen=0
        maxIndex=0


        for i in range(len(s)):
            left=i
            right=i
            while left>=0 and right<len(s) and s[left]==s[right]:
                if (right-left+1)>maxLen:
                    maxLen=right-left+1
                    maxIndex=left
                left -= 1
                right += 1
        for i in range(len(s)-1):
            left=i
            right=i+1
            while left>=0 and right<len(s) and s[left]==s[right]:
                if right-left+1>maxLen:
                    maxLen=right-left+1
                    maxIndex=left
                left -= 1
                right += 1
        return s[maxIndex:maxIndex + maxLen] 
