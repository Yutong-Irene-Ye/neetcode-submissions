class Solution:
    def isPalindrome(self, s: str) -> bool:
        #use two pointer method
        #use isalnum() method 
        #init left and right pointer 

        #given a string s return True if it is a palindrome, otherwise return false 
        #consider the input can be anything and also we treat capital and lower letter same as palindrome 
        l=0
        r=len(s)-1

        while l<r:
            while l<r and not self.isalphanum(s[l]):
                l+=1
            while l<r and not self.isalphanum(s[r]): 
                r-=1
            if s[l].lower()!=s[r].lower():
                return False 
            l+=1
            r-=1
        return True 

    def isalphanum(self, c):
        if "a"<=c<="z":
            return True  
        elif "A"<=c<="Z":
            return True  
        elif "0"<=c<="9": 
            return True 
        else: 
            return False 
            
    