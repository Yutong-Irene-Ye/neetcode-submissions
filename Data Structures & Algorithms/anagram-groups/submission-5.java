class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // first write down the steps to solve this questions  
        // notice that we have input of list of strings
        // we want to return a list of string that have the same sorted key 
        // the data strcture that I am using will be hash map, which contain key and value pairs 
        // the key will be the sorted word, and the value will be the original word 

        // now we want to loop through each word in the str
        // then inside the for loop we want to break the str into Char
        // after we break the str into char we need to sort the char, so we can identify all the word with same key and they these words are anagrams
        // then we have to normalize the char back to string 
        // after that we do a search in the map to see if the key its already in the map 
        // if not not we put the key in the map 
        // if the key its already in the map we will add the str into the map as valeu
        Map<String, List<String>> anagram= new HashMap<>(); 

        for(String str: strs){
            char [] sChar=str.toCharArray(); 
            Arrays.sort(sChar); 
            String sStr=new String(sChar); 

            // remember we need to add both the key and value in the map 
            anagram.putIfAbsent(sStr, new ArrayList<>()); 
            anagram.get(sStr).add(str);
        }

        return new ArrayList<>(anagram.values());
        
    }
}
