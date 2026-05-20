class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res=new HashMap<>(); 

        for(String str:strs){
            char [] sChar=str.toCharArray(); 
            Arrays.sort(sChar); 
            String key=new String(sChar);

            res.putIfAbsent(key, new ArrayList<>()); 
            res.get(key).add(str);

        }

        return new ArrayList<>(res.values());        
    }
}
