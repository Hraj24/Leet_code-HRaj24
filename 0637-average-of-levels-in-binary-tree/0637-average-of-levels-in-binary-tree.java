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
    public void findAvg(List<Double> ans, Queue<TreeNode> que) {
        if (que.isEmpty())
            return;
        Queue<TreeNode> temp = new LinkedList<>();
        Double sum = 0.0;
        Double size = (double) que.size();
        while (!que.isEmpty()) {
            TreeNode node = que.poll();
            sum += node.val;
            if (node.left != null)
                temp.offer(node.left);
            if (node.right != null)
                temp.offer(node.right);
        }
        ans.add(sum / size);
        findAvg(ans, temp);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        findAvg(ans, que);
        return ans;
    }
}