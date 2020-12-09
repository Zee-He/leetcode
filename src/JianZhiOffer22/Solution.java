package JianZhiOffer22;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode node=head;
        for (int i=0;i<k-1;i++){
            head=head.next;
        }
        while (head.next!=null){
            head=head.next;
            node=node.next;
        }
        return node;
    }
}