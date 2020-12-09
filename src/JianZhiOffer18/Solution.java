package JianZhiOffer18;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val==val) return head.next;
        ListNode node = head;
        while (head.next.val!=val){
            head=head.next;
        }
        head.next=head.next.next;
        return node;
    }
}
