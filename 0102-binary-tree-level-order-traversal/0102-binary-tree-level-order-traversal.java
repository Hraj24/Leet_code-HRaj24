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



// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans=new ArrayList<>();
//         Queue<TreeNode> queue=new LinkedList<>();

//         if(root==null){
//             return ans;
//         }
//         queue.add(root);
//         while(!queue.isEmpty()){
//             int level=queue.size();
//             List<Integer> subLevel=new ArrayList<>();
//             for(int i=0;i<level;i++){
//                 if(queue.peek().left!=null){
//                     queue.add(queue.peek().left);
//                 }
//                 if(queue.peek().right!=null){
//                     queue.add(queue.peek().right);
//                 }
//                 subLevel.add(queue.remove().val);
//             }
//             ans.add(subLevel);
//         }
//         return ans;
//     }
// }



class Solution {
    public void Order(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null) return;

        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }

        ans.get(level).add(root.val);

        Order(root.left, ans, level + 1);
        Order(root.right, ans, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Order(root, ans, 0);
        return ans;
    }
}