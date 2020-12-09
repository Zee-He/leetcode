package JianZhiOffer24;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode end;
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        end=head;
        function(head);
        head.next=null;
        return end;
    }
    public boolean function(ListNode node){
        if (node.next==null) return false;
        function(node.next);
        if (node.next.next==null){
            node.next.next=node;
            end=node.next;
        }
        node.next.next=node;
        return true;
    }
}