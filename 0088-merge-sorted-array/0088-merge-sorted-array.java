class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int l = 0 , r =0 , k =0;
       int[] temp = new int[m+n];

       while(l<m && r<n) {
            if(nums1[l] <= nums2[r]) {
                temp[k++] = nums1[l++];
            } else {
                temp[k++] = nums2[r++];
            }
       }

       while(l<m) {
        temp[k++] = nums1[l++];
       }

        while(r<n) {
          temp[k++] = nums2[r++];
       }

       for(int i=0; i<m+n; i++) {
         nums1[i] = temp[i];
       }


    }
}