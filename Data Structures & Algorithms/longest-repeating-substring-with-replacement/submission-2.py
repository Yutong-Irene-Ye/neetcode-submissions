class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        seen={}
        result=0
        left=0
        best=0

        for right in range(len(s)):
            seen[s[right]]=1+seen.get(s[right],0)
            best=max(best, seen[s[right]])

            while (right-left+1)-best>k:
                seen[s[left]]-=1
                left+=1
            result=max(best, right-left+1)

        return result 




        result=0 

        for i in range(len(s)):
            seen={}
            best=0
            for j in range(i, len(s)):
                seen[s[j]]=seen.get(s[j],0)+1
                best=max(best, seen[s[j]])

                if j-i+1-best<=k:
                    result=max(j-i+1, best)
            
            return result


                