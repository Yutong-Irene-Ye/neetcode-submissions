class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false; 


        Map <Character, Integer> set1=new HashMap<>(); 
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
