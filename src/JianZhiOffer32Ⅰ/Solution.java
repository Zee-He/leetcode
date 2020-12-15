package JianZhiOffer32Ⅰ;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue =new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        queue.add(root);
        if (root==null) return new int[0];
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }
        int[] res = new int[ans.size()];
        for (int i=0;i<res.length;i++) {
            res[i]=ans.get(i);
        }
        return res;
    }
}
