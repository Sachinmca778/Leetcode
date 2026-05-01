class Solution {
    public void duplicateZeros(int[] arr) {
        int k=0;
        int n = arr.length;
        int temp[] = new int[n];

        for(int i=0;i<n && k<n;i++) {

            if(arr[i] == 0) {
                temp[k++] = arr[i];
                if(k<n) {
                    temp[k++] =0;
                }
            } else {
                temp[k++] = arr[i];
            }
        } 

        for(int i=0; i<temp.length;i++) {
            arr[i] = temp[i];
        }
    }
}