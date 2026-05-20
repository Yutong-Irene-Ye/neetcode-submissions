class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> res=new HashMap<>();

        for(String s:strs){
            // in order to sort each word we much break it into char
            char [] sChar=s.toCharArray(); 
            // in order to the the key in dict we must sort it
            Arrays.sort(sChar);
            // now we must normalize the key word buy convert the char back into string 
            String sSort=new String(sChar);

            res.putIfAbsent(sSort, new ArrayList<>());
            res.get(sSort).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
