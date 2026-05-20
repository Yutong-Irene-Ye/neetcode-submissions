class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        #given an integer nums an intrger K 
        #return k most fre element within array 

        #return output in any order 

        #so this way to create a dictionary that
        #has key and how many time each key appaea in the given aray 
        seen={}
        
        for num in nums:
            seen[num]=1+seen.get(num, 0) 

        array=[]
        for num, count in seen.items():
            array.append([count, num])
        array.sort()#now the array is sorted 

        result=[]
        while len(result)<k:
            result.append(array.pop()[1])
        return result 


