class Solution:

    def encode(self, strs: List[str]) -> str:
        #when we encode we are working on a string 
        # 4?4?4? # neetcode 
        # make sure to know the return type such as str ""
        #notice in here that the return type is going to be a str
        if not strs:
            return ""
            #this is immutable 

        result=""
        size=[]

        for s in strs:
            size.append(len(s))
        
        for sz in size:
            result+=str(sz)
            result+=","
        result+="#"

        for s in strs:
            result+=s
        return result 


        
    
    def decode(self, s: str) -> List[str]:
        #now we turn string back to a list 
        #now we start we a str and need to turn it into a number 
        if not s:
            #this check must match the return type 
            return []
            # 4,4,4,3# word 
        size=[]
        result=[]
        i=0

        while s[i]!="#":
            length=""
            while s[i]!=",":
                length+=s[i]
                i+=1
            size.append(int(length))
            i+=1
        i+=1
        for sz in size:
            result.append(s[i:i+sz])
            i+=sz
        return result 
        

