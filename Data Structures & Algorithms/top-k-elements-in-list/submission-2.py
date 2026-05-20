class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        seen={}

        for num in nums:
            seen[num]=1+seen.get(num, 0)
        
        heap=[]
        for num, freq in seen.items():
            heapq.heappush(heap, (freq, num))
            
            while len(heap)>k:
                heapq.heappop(heap)

        result=[]
        while heap:
            result.append(heapq.heappop(heap)[1])
        return result 