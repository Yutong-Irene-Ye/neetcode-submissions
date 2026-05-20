class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        // map, char, compare 
        HashMap <Character, Integer> sMap=new HashMap<>(); 
        HashMap <Character, Integer> tMap=new HashMap<>(); 

        char [] sChar=s.toCharArray(); 
        char [] tChar=t.toCharArray(); 

        for(int i=0; i<sChar.length; i++){
            char a=sChar[i]; 
            sMap.put(a, sMap.getOrDefault(a, 0)+1); 
        }

        for(int j=0; j<tChar.length; j++){
            char b=tChar[j]; 
            tMap.put(b, tMap.getOrDefault(b, 0)+1);
        }

        if(sMap.equals(tMap)){
            return true;
        }
        return false; 

    }
}
