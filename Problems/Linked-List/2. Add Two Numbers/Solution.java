/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int digit = 0;
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null || p2!= null || carry != 0)
        {
            int v1 = (p1==null) ? 0 : p1.val;
            int v2 = (p2==null) ? 0 : p2.val;

            digit = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;

            current.next = new ListNode(digit);
            current = current.next;

            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }
        return dummy.next;
    }
}
