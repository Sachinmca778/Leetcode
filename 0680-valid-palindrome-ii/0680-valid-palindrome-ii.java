class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                //use super power 
                return helperValidPalindromeCheck(i+1,j,s) || helperValidPalindromeCheck(i,j-1,s);
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean helperValidPalindromeCheck(int i,int j, String s) {
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}