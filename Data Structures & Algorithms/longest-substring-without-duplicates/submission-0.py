class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        left=0
        right=0
        seen=set()
        maxLen=0
        length=0

        while right<len(s):
            if s[right] not in seen:
                seen.add(s[right])
                right+=1
                length+=1
                maxLen=max(length, maxLen)
            else:
                seen.remove(s[left])
                left+=1
                length-=1
        return maxLen

        