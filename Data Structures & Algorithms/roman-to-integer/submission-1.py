class Solution:
    def romanToInt(self, s: str) -> int:
        #first we need to build the loop up table to cover the roman into interger 
        roman={
            "I":             1,
            "V":             5,
           "X":            10,
            "L":             50,
            "C":             100,
            "D":             500,
            "M":             1000, 
        }
        total=0
        for i in range(len(s)-1):
            current=roman[s[i]]#this is to cover the roman key to value store in the roman table 
            next_val=roman[s[i+1]]
            if current<next_val:
                total-=current
            else:
                total+=current
        total+=roman[s[-1]]
        return total 
