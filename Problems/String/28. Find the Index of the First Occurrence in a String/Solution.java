class Solution {
    public int strStr(String haystack, String needle) {
        int haystacklen = haystack.length();
        int needlelen = needle.length();
        for (int i = 0; i < haystacklen-needlelen+1; i++) {
            boolean isoccurrence = true;
            int j = 0;
            while (j<needlelen) {
               if (haystack.charAt(i+j)!=needle.charAt(j)) {
                 isoccurrence = false;
                 break;
               } else { j++;}
                
            }
            if (isoccurrence) {
                return i;
            }
        }
        return -1;
    }
}
