class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, n1 = nums2.length;
        int [] merarr = new int[n+n1];
        for(int i = 0; i<nums1.length; i++){
            merarr[i] = nums1[i];
        }
        for(int j = 0; j<nums2.length; j++){
            merarr[n + j] = nums2[j];
        }
        Arrays.sort(merarr);

        if(merarr.length % 2 == 0){
            int mid1 = merarr.length/2;
            int mid2 = mid1 - 1;
            return (merarr[mid1] + merarr[mid2])/2.0;
        }else{
            return merarr[merarr.length/2];
        }
    }
}