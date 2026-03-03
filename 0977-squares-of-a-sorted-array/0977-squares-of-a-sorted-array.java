class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int square =0;
        for(int i=0; i<arr.length ; i++) {
             arr[i]  = nums[i]*nums[i];
             
        }
        Arrays.sort(arr);

        return arr;
        
    }
}