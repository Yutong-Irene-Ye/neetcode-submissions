class Solution {
    public boolean isAnagram(String s, String t) {
        // ask is whether the string input is anagram 
        // output is true if yes, not true if false 
        // now think about the rule
        // first what is anagram?
        // each number has the same number of occurance 
        // also it must has the same length
        // the order does not matter

        // plan 1 we can create two set, set 1 and set 2 to the two set
        // plan 2 keep count of each letter in set 1 then reduce the count when we seen the same letter in set 2

        if(s.length()!=t.length()) return false; 

        Map <Character, Integer> set1=new HashMap<>(); 
        // also we need to turn the string into charc 
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i); 
            set1.put(s1, set1.getOrDefault(s1,0)+1);
        }

        Map <Character, Integer> set2=new HashMap<>(); 
        for(int i=0; i<t.length(); i++){
            char s2=t.charAt(i); 
            set2.put(s2, set2.getOrDefault(s2,0)+1);
        }

        if(set1.equals(set2)) return true; 
        return false;
    }
}
