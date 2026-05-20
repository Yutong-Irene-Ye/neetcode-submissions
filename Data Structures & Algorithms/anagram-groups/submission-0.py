class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #given an aray of string str, group all anagra, togeher into subist
        # you may return the output in any order
        # ok now what is an anagram, an anagram is a string consist of the same number of charaters but the
        # character might be in diff order 
        # leetcode define it as a string that contain the exact same charter as anoterh stin gbut the order of the chatracter can be difftent 

        #rule #1 if the len arnt the same they are anagram 
        #if I want to solve this problem using a dictionary 
        #what is the key, they key is the letter in the word plus how many tim eeach letter appear 
        #so we can use a dict with build key that we are desiging right now 
        #then we add the orignal word as the value 
        #so if the word has same key we put hen in the list of the value of that key then just buy returning the value we will have the list 

        #method 1, use a dict 
        seen={}

        for s in strs:
            sorted_s=''.join(sorted(s))

            if sorted_s in seen:
                seen[sorted_s].append(s)
            else:
                seen[sorted_s]=[s]
        return list(seen.values())
        

        
        #method 2, use ord values for the 26 letter 