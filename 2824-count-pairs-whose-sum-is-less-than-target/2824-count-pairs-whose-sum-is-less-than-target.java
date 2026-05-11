class Solution {
    public int countPairs(List<Integer> nums, int target) {

        //Optimal Approach (Two Pointer)
        Collections.sort(nums);
         int n = nums.size();
         int left =0;
         int right = n-1;
         int count =0;

         while (left <= right) {
            int sum = nums.get(left) + nums.get(right);
            if(sum < target) {
               count += (right - left);

               left++;
            } else {
                right--;
            }
         }

         return count;


        //Brute force Approach

        // int n = nums.size();
        // int count =0;
        // for(int i=0; i<n-1; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(nums.get(i)+ nums.get(j) < target) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}