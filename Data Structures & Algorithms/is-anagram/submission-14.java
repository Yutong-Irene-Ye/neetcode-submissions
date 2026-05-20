class Solution {
    public boolean isAnagram(String s, String t) {
        // this is anagram so we check the length first 
        // breakdown the string into char 
        // sort the char of each string
        // compare the two sorted char in the string using Arrays.is equal

        // know how to use the length method or field, here we compare the length we need to use the method with ()
        if(s.length()!=t.length()){
            return false;
        }

        char [] sChar=s.toCharArray(); 
        char [] tChar=t.toCharArray(); 

        Arrays.sort(sChar);
        Arrays.sort(tChar); 

        if(Arrays.equals(sChar, tChar)){
            return true;
        }
        return false;

    }
}
