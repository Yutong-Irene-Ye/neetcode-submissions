class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
            #key is how to deal with the dupicate, becuase duplicate is allow 
            #case 1 if nums[i]>0, stop checking 
            #case 2 if current num=previous num then we continue and skip this duplicate 

            #we need a data strcture to store the triplet we saw becuase the answers are not unique 
            #then we need to make sure we do not contain any duplicate triplet becuase 
            #to achove no duplicate first we know that the array is alreafy sorted so we only need to skip the need same elements
            
            #the absolute first thing to do is to sort the array
        nums.sort() 
        resultList=[]

        if not nums:
            return resultList 

        for i in range(len(nums)):
            #need to skip the duplicate
            #need to skip the i greater than the i 
            if nums[i]>0:
                break
            if i>0 and nums[i]==nums[i-1]:
                continue

            left=i+1
            right=len(nums)-1
            while left<right:
                total=nums[i]+nums[left]+nums[right]
                if total>0:
                    right-=1
                elif total<0:
                    left+=1
                else:
                    resultList.append([nums[i],nums[left],nums[right]])
                    left+=1
                    right-=1
                    while left<right and nums[left]==nums[left-1]:
                        left+=1
        return resultList 


            



                
            





