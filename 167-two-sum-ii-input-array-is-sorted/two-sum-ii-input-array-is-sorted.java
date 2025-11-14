class Solution {
    public int[] twoSum(int[] a, int target) {
       int left = 0, right = a.length-1;
       while(a[left] + a[right] != target)
            if(a[left] + a[right] < target)
                left++;
            else
                right--;

        return new int[] {left+1 , right+1};      
    }
}