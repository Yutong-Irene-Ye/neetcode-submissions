class Solution:
    def longestPalindrome(self, s: str) -> str:
        #a brute force way to check each single pair using the nested loop  
        result=0
        maxLen=0 

        for i in range(len(s)):
            for j in range(i, len(s)):
                left=i
                right=j
                while left<right and s[left]==s[right]:
                    left+=1
                    right-=1 

                if left>=right and maxLen<(j-i+1):
                    result=s[i:j+1]
                    maxLen=len(result)
        return result 

