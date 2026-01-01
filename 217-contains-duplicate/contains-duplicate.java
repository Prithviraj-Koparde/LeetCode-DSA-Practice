class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for (Integer i : nums){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                mp.put(i,mp.get(i)+1);
            }
        }

        for(Integer i : nums){
            if(mp.get(i) > 1) return true;
        }
        return false;
    }
}