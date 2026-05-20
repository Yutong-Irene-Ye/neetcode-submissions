class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        # given an sorted array 
        # please note that this aray is 1 based index #
        # we want to approach this problem with teo pointer method 
        #this only works if the array of num is sorted 
        #there will always be a solution and exacatly one solution 

        l=0
        r=len(numbers)-1

        #given and array of nums, please return the 
        while l<r:
            total=numbers[l]+numbers[r]
            #given 2 nums such that they add up to a given target and index 1>index 2
            #index 1 and index 2 ca not be equal 
            if total==target:
                return [l+1, r+1]
            elif total<=target:
                l+=1
            elif total>=target: 
                r-=1
        return []




        