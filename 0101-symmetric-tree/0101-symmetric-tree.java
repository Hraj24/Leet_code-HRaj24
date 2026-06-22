/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }
    private boolean isSymmetric(TreeNode leftSub,TreeNode rightSub){
        if(leftSub==null || rightSub==null){
            return leftSub==rightSub;
        }
        if(leftSub.val != rightSub.val){
            return false;
        }
        return isSymmetric(leftSub.left,rightSub.right) && isSymmetric(leftSub.right,rightSub.left);
    }
}