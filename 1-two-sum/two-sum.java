class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];

            if (mp.containsKey(num))
                return new int[] { mp.get(num), i };
            mp.put(arr[i], i);
        }

        return new int[] {};
    }
}

// int [] ans = new int[2];
//         int k =0;
//         for(int i= 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i]+arr[j]==target){
//                     ans[k++]=i;
//                     ans[k++]=j;
//                 }
//             }
//         }
//         return ans;