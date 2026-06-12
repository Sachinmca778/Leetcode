class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int i=0, k=0;
        int j = n-1;

        while(k<=j) {
            if(nums[k]==1) {
                k=k+1;
            } else if(nums[k]==2) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;

                j=j-1;
            } else {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;

                i= i+1;
                k=k+1;
            }
        }
    }
}