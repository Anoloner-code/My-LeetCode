import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> thisstack = new Stack<Character>();

        for (int i = 0 ; i < s.length();i++) {
            char thischar = s.charAt(i);
            if (thischar == '(' || thischar == '{'|| thischar == '[' ) {
                thisstack.push(thischar);
            }
            if (thischar == ')' || thischar == '}'|| thischar == ']' ) {
                if (thisstack.empty()) return false;
                switch (thischar) {
                    case ')':
                        if (thisstack.peek() != '(') return false;
                        thisstack.pop();
                        break;

                    case '}':
                        if (thisstack.peek() != '{') return false;
                        thisstack.pop();
                        break;

                    case ']':
                        if (thisstack.peek() != '[') return false;
                        thisstack.pop();
                        break;
                }
            }
        }
            return thisstack.empty();
    }
}
