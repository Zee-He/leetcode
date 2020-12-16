package JianZhiOffer36;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if (root==null) return null;
        function(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    void function(Node root){
        if (root==null) return;
        function(root.left);
        if (pre!=null) pre.right = root;
        else head=root;
        root.left=pre;
        pre=root;
        function(root.right);
    }
}
