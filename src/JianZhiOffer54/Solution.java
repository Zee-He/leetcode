package JianZhiOffer54;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> res = new LinkedList<>();
    public int kthLargest(TreeNode root, int k) {
        function(root,k);
        return res.get(k-1);
    }
    void function(TreeNode root, int k){
        if (root==null) return;
        if (res.size()>=k) return;
        function(root.right,k);
        res.add(root.val);
        function(root.left, k);
    }
}
