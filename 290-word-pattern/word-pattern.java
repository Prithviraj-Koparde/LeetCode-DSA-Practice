class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character, String> mp = new HashMap<>();
        if (pattern.length() != arr.length)
            return false;

        for (int i = 0; i < arr.length; i++) {
            Character pCh = pattern.charAt(i);
            String sCh = arr[i];

            if (mp.containsKey(pCh)) {
                if (!sCh.equals(mp.get(pCh)))
                    return false;
            } else if (mp.containsValue(sCh))
                return false;
            else {
                mp.put(pCh, sCh);
            }
        }
        return true;
    }
}