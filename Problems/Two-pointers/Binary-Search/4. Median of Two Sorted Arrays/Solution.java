class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1, left2, right1, right2;
        int m = nums1.length;
        int n = nums2.length;
        if (m>n) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        m = nums1.length;
        n = nums2.length;
        int totalsize = m + n;
        int leftsize = (m+n+1) / 2;
        int low = 0;
        int high = m;

        while (low <= high) {
            int partitionposition1 = (low+high)/2;
            int partitionposition2 = leftsize - partitionposition1;
            left1  = (partitionposition1==0) ? Integer.MIN_VALUE : nums1[partitionposition1-1];
            right1 = (partitionposition1==m) ? Integer.MAX_VALUE : nums1[partitionposition1];

            left2  = (partitionposition2==0) ? Integer.MIN_VALUE : nums2[partitionposition2-1];
            right2 = (partitionposition2==n) ? Integer.MAX_VALUE : nums2[partitionposition2];

            if (left1 <= right2 && left2 <= right1) {

            if (totalsize%2 == 0) {return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;} else {return Math.max(left1,left2);}
        } 
            if (left1 > right2) {
                high = partitionposition1 - 1;
            } else if (left2> right1) {
                low = partitionposition1 + 1;
            }
        }


    
        return 0;

    }
}
