class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        // here the data strcture we wanted to use is an array in the size of 26 
        int [] freq=new int[26];

        char [] sChar=s.toCharArray(); 
        char [] tChar=t.toCharArray(); 


        for(int i=0; i<sChar.length; i++){
            // if we try to do a numeric operation, java will convert the charc into asascii value 
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int val:freq){
            if(val!=0){
                return false;
            }
        }
        return true;

    }
}
