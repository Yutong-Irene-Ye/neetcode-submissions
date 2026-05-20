class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // the plan its to creat a hashmap 
        // first in the map we store the sorted word as the key
        // then we store the original words in list as the value in the map 
        // then we will retURn THe list in value as groups of words 

        HashMap <String, List<String>> seen=new HashMap<>(); 

        for(String str:strs){
            // for primary words 
            char [] newChar=str.toCharArray(); 
            Arrays.sort(newChar);
            String key=new String(newChar);

            seen.putIfAbsent(key, new ArrayList<>());
            seen.get(key).add(str);
        }

        return new ArrayList<>(seen.values());

        
    }
}
