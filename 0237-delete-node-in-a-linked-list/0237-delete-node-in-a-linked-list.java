/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next ; 
        // if( temp.next == null ) {
        //     node.next = null ;
        //     return ;
        // }

        while( temp != null ){
            node.val = temp.val ; 
            temp = temp.next ;
          if(temp != null)  node = node.next ; 
        }
        node.next = null ;
    }
}