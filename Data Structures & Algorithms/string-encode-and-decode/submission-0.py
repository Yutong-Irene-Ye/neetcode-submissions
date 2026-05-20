class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs:
            return ""

        sizes=[]
        result=""
        #step 1 get the len of ths str
        for s in strs:
            sizes.append(len(s))
        #step 2 append the side and , to the result string 
        for sz in sizes:
            result+=str(sz)
            result+=','
        #step 3 append the len(str) and , and $ and the original word on to the result strong 
        result+='#'
        for s in strs:
            result+=s
        return result 

    def decode(self, s: str) -> List[str]:
        if not s: 
            return []
        sizes=[]
        result=[]
        i=0

        while s[i]!='#':
            current=""
            while s[i]!=',':
                current+=s[i]
                i+=1
            sizes.append(int(current))
            i+=1
        i+=1

        for sz in sizes:
            result.append(s[i:i+sz])
            i+=sz
        return result 
            



            