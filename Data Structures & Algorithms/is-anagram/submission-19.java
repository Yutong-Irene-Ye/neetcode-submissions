class Solution {
    public boolean isAnagram(String s, String t) {
        // first check the absolute stop condition, so we can stop the check early on 
        if(s.length()!=t.length()){
            return false; 
        }

        // now we want two sorted Array and compare if the two sorted array are the same
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
