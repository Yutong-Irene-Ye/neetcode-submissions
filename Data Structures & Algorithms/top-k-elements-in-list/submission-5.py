class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #method, use dictionary and array and short by value pop the last 
        seen={}
        freq=[[] for i in range(len(nums)+1)]

        for num in nums:
            seen[num]=1+seen.get(num,0)
        
        for num, count in seen.items():
            freq[count].append(num)

        result=[]
        for i in range(len(freq)-1,0,-1):
            for num in freq[i]:
                result.append(num)
                if len(result)==k:
                    return result 


