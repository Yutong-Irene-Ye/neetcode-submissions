class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left=0
        right=len(heights)-1
        result=0
        while left<right:
            width=right-left
            result=max(result, min(heights[left], heights[right])*width)
            if heights[left]<=heights[right]:
                left+=1
            else: 
                right-=1
        return result  

        