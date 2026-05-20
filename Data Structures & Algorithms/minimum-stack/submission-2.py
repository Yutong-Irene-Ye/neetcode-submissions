class MinStack:

    def __init__(self):
        self.stack=[]
        self.minStack=[]
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        #option A nothing on the minstack we return the current val
        if not self.minStack:
            minVal=val 
        #option B nothing 
        else:
            minVal=min(self.minStack[-1], val)

        self.minStack.append(minVal)
        

    def pop(self) -> None:
        self.stack.pop()
        self.minStack.pop()
        

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        if not self.minStack:
            return None
        return self.minStack[-1]
        
