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
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null ) return null ; 
        if( head.next == null) return head ; 

        ListNode prev = new ListNode(-100) ; 
        ListNode temp = head ; 
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy ;

        while( temp.next != null) {
         
            if(temp.val != prev.val && temp.val != temp.next.val){
                cur.next = temp ;
                cur = cur.next ;
            }
            prev = temp ;
            temp = temp.next ;
        }

        cur.next = (prev.val != temp.val) ? temp : null;

        return dummy.next ;
    }
}