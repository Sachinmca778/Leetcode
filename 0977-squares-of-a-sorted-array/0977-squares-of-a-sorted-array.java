class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;

        while(i<=j) {
            if(Math.abs(nums[i]) < Math.abs(nums[j])) {
                arr[k] = nums[j]*nums[j];
                j--;
                k--;
            } else {
                arr[k] = nums[i]*nums[i];
                i++;
                k--;
            }
        }

        return arr;

        
        
    }

    //Brute Force
    // public int[] sortedSquares(int[] nums) {
    //     int[] arr = new int[nums.length];
    //     int square =0;
    //     for (int i=0; i<arr.length ; i++) {
    //          arr[i]  = nums[i]*nums[i];
             
    //     }
        
    //     Arrays.sort(arr);

    //     return arr;
        
    // }
}