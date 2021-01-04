package JianZhiOffer55Ⅱ;

import Util.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return function(root) != -1;
    }

    private int function(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = function(root.left);
        if (left == -1) return -1;
        int right = function(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
