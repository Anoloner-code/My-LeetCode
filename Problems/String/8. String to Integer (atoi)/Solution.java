class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int stoi = 0;
        int sign = 1;
        if (s.length()==0) return 0;
        char character = s.charAt(0);
        int digit = 0;
        if (character == '-' || character == '+') {
            if (character == '-') sign = -1;
            s = s.substring(1);
        }
        for (int i = 0; i < s.length();i++) {
            character = s.charAt(i);
            if (character < '0'|| character > '9') break;
            digit = character - '0';
            if ((stoi > Integer.MAX_VALUE/10 || (stoi == Integer.MAX_VALUE/10 && digit > 7))) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            if (character >= '0' && character <= '9') {
                stoi = stoi*10 + digit;
            } else {
                stoi *= sign;
                return stoi;
            }
        }
        return stoi*sign;
    }
}
