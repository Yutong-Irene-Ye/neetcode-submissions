class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #method 
        seen={}

        for num in nums:
            seen[num]=1+seen.get(num, 0)
        
        array=[]
        for num, value in seen.items():
            array.append([value, num])
        array.sort() 

        result=[]

        while len(result)<k:
            result.append(array.pop()[1])
        return result 
