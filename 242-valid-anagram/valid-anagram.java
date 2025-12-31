class Solution {
    public HashMap<Character, Integer> freqMP(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> mp = freqMP(s);

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) {
                return false;
            } else {
                mp.put(ch, mp.get(ch) - 1);
            }
            if (mp.get(ch) == 0)
                mp.remove(ch);
        }

        if (mp.size() != 0)
            return false;
        else
            return true;
    }
}