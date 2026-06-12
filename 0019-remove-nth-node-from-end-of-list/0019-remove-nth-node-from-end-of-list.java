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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head; 
        ListNode l = head;
        int len=0;

        while(l!=null) {
            l = l.next;
            len++;
        }

        int d = len-n+1;

        ListNode prev = dummy,
                 curr = head;
        int i =0;
        while(i<(d-1)) {
            curr = curr.next;
            prev = prev.next;
            i=i+1;
        }

        prev.next = prev.next.next;

        return dummy.next;







        // ListNode slow = head;
        // ListNode fast = head;

        // for(int i=1; i<=n ; i++) {
        //     fast = fast.next;
        // }

        // // delete first node
        // if(fast == null) {
        //     return head.next;
        // }
        // while (fast.next!=null) {
        //     slow = slow.next;
        //     fast = fast.next;
        // }

        // slow.next = slow.next.next;

        // return head;
        
    }
}