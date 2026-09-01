class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> hm = new HashMap<>();
        
        for (int i =0; i< strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);

            String sortedWord = new String(ch);
            if(!hm.containsKey(sortedWord)) {
                hm.put(sortedWord, new ArrayList<>());
            }

            hm.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(hm.values());
        
    }
}