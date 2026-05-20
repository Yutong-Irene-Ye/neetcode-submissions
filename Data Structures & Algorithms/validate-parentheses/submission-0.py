class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        closeToOpen={
        ")":"(", 
        "]":"[", 
        "}":"{"
        }


        for c in s:
            #check foor the key in the map which is the close 
            if c in closeToOpen:
                #
                if len(stack)>0 and stack[-1]==closeToOpen[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)

        return True if not stack else False