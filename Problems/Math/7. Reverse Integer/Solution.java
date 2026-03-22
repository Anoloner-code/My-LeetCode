class Solution {
    public int reverse(int x) {
        boolean negative = (x<0) ?  true: false;
        int reversesum = 0;
        while (x != 0) {   
            if (reversesum > Integer.MAX_VALUE/10 || reversesum < Integer.MIN_VALUE/10) return 0;
            reversesum = reversesum*10 + x%10;
            x /= 10;
        }
  
        return reversesum;
    }
}
