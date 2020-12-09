package JianZhiOffer07;

import java.util.Arrays;

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0){
            return null;
        }
        int rootval = preorder[0];
        TreeNode root = new TreeNode(rootval);
        int i=0;
        for(i=0;i<inorder.length;i++){
            if (inorder[i]==preorder[0]){
                break;
            }
        }
        int[] leftPreorder= Arrays.copyOfRange(preorder,1,1+i);
        int[] leftInorder= Arrays.copyOfRange(inorder,0,i);
        int[] rightPreorder= Arrays.copyOfRange(preorder,i+1,preorder.length);
        int[] rightInorder= Arrays.copyOfRange(inorder,i+1,inorder.length);
        root.left=buildTree(leftPreorder,leftInorder);
        root.right=buildTree(rightPreorder,rightInorder);
        return root;
    }
}
