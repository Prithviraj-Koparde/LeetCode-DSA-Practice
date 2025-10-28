class Solution {
    public int majorityElement(int[] arr) {
        int elected = 0, count = 0;     // no one is elected

        for(int num : arr){
            if(count == 0) elected = num;     // condition true then elected assigned a num
            count += (num == elected) ? 1 :-1;//here either 1 will be assigned or -1 based on cond
        }
        return elected;
    }
}// every time count = count + (num == elected) ? 1 :-1; is breaked count resets to 0 and new num is assigned to elected value.