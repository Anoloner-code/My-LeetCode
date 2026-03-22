import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int max = 0;
        Map<Character, Integer> allchars = new HashMap<>();
        for (int end = 0; end < s.length();end++) {
            char last = s.charAt(end);
            if (allchars.containsKey(last)) {
                
                start = Math.max(start, allchars.get(last) + 1);
            }
            allchars.put(last, end);
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
