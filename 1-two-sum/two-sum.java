class Solution {
    public int[] twoSum(int[] arr, int target) {
        int [] ans = new int[2];
        int k =0;
        for(int i= 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    ans[k++]=i;
                    ans[k++]=j;
                }
            }
        }
        return ans;
    }
}