class Solution {
    public int longestConsecutive(int[] nums) {

        // if (nums.length == 0) {
        //     return 0;
        // }

        // int count = 1;
        // int consecutive_count = 1;

        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length - 1; i++) {

        //     // Consecutive number
        //     if (nums[i] + 1 == nums[i + 1]) {
        //         count++;
        //         consecutive_count = Math.max(consecutive_count, count);
        //     }

        //     // Duplicate number -> ignore
        //     else if (nums[i] == nums[i + 1]) {
        //         continue;
        //     }

        //     // Not consecutive
        //     else {
        //         count = 1;
        //     }
        // }

        // return consecutive_count;



       HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        for (int num : set) {

            // Only start from sequence beginning
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}