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
    public ListNode removeNodes(ListNode head) {
        ListNode rev = Reverse(head); 
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy ;
        int max = rev.val;
        while( rev != null) {
             if( max <= rev.val){
                max = rev.val;
                cur.next = rev ; 
                cur = cur.next ;
             }

             rev = rev.next ;
        }
        cur.next = null;
        return Reverse(dummy.next) ; 

    }

    public ListNode Reverse( ListNode head ){
        ListNode prev = null ; 
        ListNode present = head ; 
        ListNode next = head.next ; 

        while( present != null){
            present.next = prev ; 
            prev = present ; 
            present = next ; 
            if( next != null ){
                next = next.next ;
            }
        }

        return prev ;
    }
}