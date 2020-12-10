package JianZhiOffer26;

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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null)&&(B!=null)&&(function(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }
    boolean function(TreeNode A, TreeNode B){
        if (B==null) return true;
        if (A==null||A.val!=B.val) return false;
        return function(A.left,B.left)&&function(A.right,B.right);
    }
}