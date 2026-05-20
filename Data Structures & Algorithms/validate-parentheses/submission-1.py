class Solution:
    def isValid(self, s: str) -> bool:
        if not s:
            return True
        
        stack=[]
        closeToOpen={
            "}":"{",
            "]":"[",
            ")":"("
        }

        for c in s:
            #now we try to match by the key of the dic 
            if c in closeToOpen:
                if not stack or stack[-1]!=closeToOpen[c]:
                    #under these condition and check we will return false 
                    return False 
                else:
                    #of we find a match in the dict we pop from the tack the open bracket 
                    stack.pop()

            else:
                stack.append(c)
                
        if not stack:
            return True 
        else:
            return False 

        