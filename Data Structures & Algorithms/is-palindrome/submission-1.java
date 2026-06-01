class Solution {
    public boolean isPalindrome(String s) {
        // a palindrome is a stirng that reads the same foraward abd backward 
        // that reads the samefarwad am bacl\kward
        // case-insensitive and ignores all non-alphanumeric
        StringBuilder newStr=new StringBuilder(); 
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString()); 
        
    }
}
