class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length();i++) {
            char currentchar = strs[0].charAt(i);
            for (int j = 0;j< strs.length;j++) {
                if (i == strs[j].length() ||strs[j].charAt(i)!=currentchar) {
                    return prefix;
                }
                
            }

            prefix += currentchar;
        }
        return prefix;
    }
}
