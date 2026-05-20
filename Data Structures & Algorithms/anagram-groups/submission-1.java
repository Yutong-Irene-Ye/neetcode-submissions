class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // we use ArrayList
        // becuase its dynamic array and and grow and shirnk 
        // it maintain the order 
        // it allow duplicate 
        HashMap<String, List<String>> res=new HashMap<>();

        for(String s:strs){
            // to char
            // sort
            // to string 

            // I can manipulate data but have to store it too 
            char [] sChar=s.toCharArray();
            Arrays.sort(sChar);
            String sSort=new String(sChar);

            res.putIfAbsent(sSort, new ArrayList<>());
            res.get(sSort).add(s);

        }
        return new ArrayList<>(res.values());
        
    }
}
