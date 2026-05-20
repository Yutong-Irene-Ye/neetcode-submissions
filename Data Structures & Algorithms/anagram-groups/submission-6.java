class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // hashmap
        // using for loop to loop through each str in the str list 
        // string to char
        // sort char
        // char to string 
        // add sorted char as key
        // add the value string to the matching key 
        // return the value as a list 
        Map <String, List<String>> anagrams= new HashMap<>(); 

        for(String str:strs){
            char [] sChar=str.toCharArray(); 
            Arrays.sort(sChar); 
            String sKey=new String (sChar); 

            anagrams.putIfAbsent(sKey, new ArrayList<>()); 
            anagrams.get(sKey).add(str);
        }

        return new ArrayList<>(anagrams.values());
        
    }
}
