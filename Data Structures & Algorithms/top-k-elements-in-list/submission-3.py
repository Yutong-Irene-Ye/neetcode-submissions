class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #method, use dictionary and array and short by value pop the last 
        seen={}

        for num in nums:
            seen[num]=1+seen.get(num, 0)
        
        array=[]
        for num, freq in seen.items():
            array.append((freq, num))
        array.sort()

        result=[]
        while len(result)<k:
            result.append(array.pop()[1])
        return result 