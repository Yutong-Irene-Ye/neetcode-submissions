class MinStack:

    def __init__(self):
        #use a regular stack to store the val
        self.stack=[]
        #use a min stack to store the min we seem so far 
        self.minStack=[]
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        if not self.minStack:
            minVal=val 
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
        
