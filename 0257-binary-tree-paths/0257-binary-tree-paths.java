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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, ans, "");
        return ans;
    }

    static void dfs(TreeNode node, List<String> ans, String path) {
        if (node == null)
            return;

        path += node.val;

        if (node.left == null && node.right == null) {
            ans.add(path);
            return;
        }

        dfs(node.left, ans, path + "->");
        dfs(node.right, ans, path + "->");
    }
}