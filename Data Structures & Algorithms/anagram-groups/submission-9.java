class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> res=new HashMap<>(); 

        for(String str: strs){
            // init 26 int space to store the count of num in each letter position 
            // loop through the char in the string 
            // add the int as the key, first by convert them into key 
            // then check if the key exist or not then ass the value to the key 
            // then return the key 
            int [] count=new int[26]; 

            for(char c:str.toCharArray()){
                count[c-'a']++; 
            }

            String key=Arrays.toString(count); 

            res.putIfAbsent(key, new ArrayList<>()); 
            res.get(key).add(str); 
        }

        return new ArrayList<>(res.values());
        
    }
}
