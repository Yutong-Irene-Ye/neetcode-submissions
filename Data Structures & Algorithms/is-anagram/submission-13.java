class Solution {
    public boolean isAnagram(String s, String t) {
        // method 1 compare two sorted array 
        // method 2 store the char and the freq in two map and compare twp maps
        // method 3 make 1 map and keep count of the freq of the char in the map, while we loop through the second map we will decrease the freq of the num in the map 
        if(s.length()!=t.length()); 

        // while we sort, we must also convert the string into character
        char [] sChar=s.toCharArray(); 
        char [] tChar=t.toCharArray(); 

        Arrays.sort(sChar); 
        Arrays.sort(tChar); 

        if(Arrays.equals(sChar, tChar)){
            return true;
        }
        return false; 

    }
}
