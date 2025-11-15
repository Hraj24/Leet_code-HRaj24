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
    boolean hasPathSumHelper(TreeNode root, int maxSum, int targetSum){
        if(root == null){
            return false;  
        }
        maxSum += root.val;

        if(root.left == null && root.right == null){
            return maxSum == targetSum;
        }
        boolean left = hasPathSumHelper(root.left, maxSum, targetSum);
        boolean right = hasPathSumHelper(root.right, maxSum, targetSum);

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, 0, targetSum);
    }
}