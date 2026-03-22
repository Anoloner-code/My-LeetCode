class Solution {
    public boolean isPalindrome(int x) {
        if (x< 0) return false;
        if (x!= 0 && x % 10 == 0) return false;
        int reversedigit  = 0;
        while (x > reversedigit) {
            reversedigit = reversedigit*10 + x % 10;
                x /= 10;
        }
        return (x == reversedigit) || (x == reversedigit / 10);
    }
}
