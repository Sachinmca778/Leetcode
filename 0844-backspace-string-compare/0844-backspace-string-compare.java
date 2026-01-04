class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    public static String process(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i< str.length() ; i++ ) {
            char c = str.charAt(i);
            if(c =='#') {

                if(sb.length()>0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}