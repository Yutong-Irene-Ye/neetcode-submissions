class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create map
        // loop throug the str
        // break into char 
        // store as llist of 26 slots 
        Map <String, List<String>> anagrams=new HashMap<>(); 

        for(String str:strs){
            // how to create ASCII map of 26 slot?
            // [][][] we need 26 slot 

            int [] count=new int [26];
            for(char c:str.toCharArray()) {
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        }

        return new ArrayList<>(anagrams.values());
        
    }
}
