class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] ch = new char[n];
        int j =0;
        for(int i=n-1;i>=0;i--) {
            ch[j] = s[i];
            j++;
        }
        for(int i=0; i<ch.length; i++) {
            s[i] =ch[i];
        }


    }
}