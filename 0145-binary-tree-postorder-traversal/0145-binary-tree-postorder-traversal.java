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
    private List<Integer> res=new ArrayList<>();
    //Recursive Approach
    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        traversal(root.right);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        // traversal(root);
        // return res;

        // Iterative Approach(with 2 Stack)
        List<Integer> postorder=new ArrayList<>();
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        if(root==null){
            return postorder;
        }
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);  
            if (root.left != null) {
                st1.push(root.left);
            }
            if (root.right != null) {
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()) {
            postorder.add(st2.pop().val); 
        }
        return postorder;
        
    }
}