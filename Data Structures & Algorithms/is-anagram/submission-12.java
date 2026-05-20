class Solution {
    public boolean isAnagram(String s, String t) {
        // compare the two string
        // how to compare the two string

        // method 1 sort the two string and compare the strong 
        // method 2 create two map and compare the two map 
        // method 3 create 1 map to keep track of the key as the char and value as the num
        // when we loop through the first string we are going to add the count for that letter as the key
        // afther that we will loop thrugh the second string and reduce count of the matching letter while we loop through the second string 
        // if in the end the value for all char are 0 we will return true, else we will return false 

        // in in order to sort the two strings we must turn them into individual characters
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
