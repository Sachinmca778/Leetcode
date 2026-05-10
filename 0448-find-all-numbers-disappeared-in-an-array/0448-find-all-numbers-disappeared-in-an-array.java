class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        for(int i=0;i<nums.length;i++) {
            int count =0;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                map.put(nums[i], count++);
            } else {
                map.put(nums[i], count++);
            }
        }

        List<Integer> temp = new ArrayList<>();
        for(int i=1;i<=nums.length;i++) {
            if (!map.containsKey(i)) {
                temp.add(i);
            }
        }

        return temp;


    }
}