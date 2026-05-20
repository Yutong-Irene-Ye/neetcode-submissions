class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // first choose a data strcture map 
        // then we need to loop through each str in the strs
        // now we need to break the str into char
        // after we have the char now we need to sort the char 
        // after we sorted the char we need to turn it back into string 
        // now we have to put the sorted string as the key of the map
        // when we add the key we first need to make sure the key exisit or not using the put if absent mathod
        // then we need to get key and put the str as the value list to that matching key 
        HashMap<String, List<String>> anagram=new HashMap<>(); 

        for(String str: strs){
            char [] sChar=str.toCharArray(); 
            Arrays.sort(sChar); 
            String keyStr=new String (sChar); 

            anagram.putIfAbsent(keyStr, new ArrayList<>());
            anagram.get(keyStr).add(str);
        }

        return new ArrayList<>(anagram.values());
        
    }
}
