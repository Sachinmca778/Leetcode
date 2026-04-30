class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left =0;
        int right =0;
        int k =0;
        int n = nums1.length;
        int m = nums2.length;
        int[] temp = new int[n+m];
        double median = 0.000;

        while(left < n && right < m) {
            if(nums1[left] < nums2[right]) {
                temp[k++] = nums1[left++];
            } else {
                temp[k++] = nums2[right++];
            }
        }

        while(left < n) {
            temp[k++] = nums1[left++];
        }

        while(right < m) {
            temp[k++] = nums2[right++];
        }

        

        int t = temp.length;
        if(t%2 ==0) {
            System.out.println(t+","+temp[t/2]+"a"+temp[(t/2)-1]+"b");
           median = (double) (temp[t/2] + temp[(t/2)-1]) /2;
        } else {
           median =  temp[(t/2)];
        }

        return median;


    }
}