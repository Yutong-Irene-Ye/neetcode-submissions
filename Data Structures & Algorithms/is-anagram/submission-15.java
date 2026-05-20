class Solution {
    public boolean isAnagram(String s, String t) {
        // if use sorting will be 2 n log n 
        // space will be o n to store the sorted array 
        //method 2 create two map and use map.equals to compare the two map 
        Map <Character, Integer> sMap=new HashMap<>(); 
        Map <Character, Integer> tMap=new HashMap<>(); 

        char [] sChar=s.toCharArray(); 
        char [] tChar=t.toCharArray(); 

        // now for do you put the char and num both into a map?
        for(int i=0; i<sChar.length; i++){
            char a=sChar[i];
            sMap.put(a, sMap.getOrDefault(a, 0)+1);
        }
            // put for map, add for set 


        for(int j=0; j<tChar.length; j++){
            char b=tChar[j];
            tMap.put(b, tMap.getOrDefault(b,0)+1);
        }

        // can not use this map only for array s
        if(sMap.equals(tMap)){
            return true;
        }
        return false;

    }
}
