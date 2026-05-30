class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> st = new HashSet<Integer>();
        int n = candyType.length;
        int divide = n/2;
        for(int i=0;i<n;i++) {
            if(!st.contains(candyType[i])) {
                st.add(candyType[i]);
            }
        }
        if(st.size()> divide) {
            return divide;
        } else {
            return st.size();
        }

    }
}