class Solution {
    public int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i = n-1; i>=0; i--){
        if(digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
    }
    // if digits array become full of 0's then for carry one we will create arr array of length n+1
    int [] arr = new int [n+1];
    arr[0] = 1;
    return arr;
    }
}
