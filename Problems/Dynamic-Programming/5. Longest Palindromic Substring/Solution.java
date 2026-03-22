class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int length = s.length();
        String substring = s.substring(0,1);
        int longestlength = 0;
        for (int i = 0; i < length; i++) {
            start = i;
            end = i;
            while (start>=0 && end < length && s.charAt(start) == s.charAt(end)) {
                start -=1;
                end += 1;     
                if (end-start > longestlength) {
                    longestlength = end-start-1;
                    substring = s.substring(start+1,end);
                    }
            }
            start = i;
            end = i + 1;
            while (start>=0 && end < length && s.charAt(start) == s.charAt(end)) { 
                start -=1;
                end += 1;     
     
                if (end-start > longestlength) {
                        longestlength = end-start-1;
                        substring = s.substring(start+1,end);
                    }
                    
            }
            }
            return substring;
        }
    }
