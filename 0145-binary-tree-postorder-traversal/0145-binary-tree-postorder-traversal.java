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
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         postOrderHelper(root,ans);
//         return ans;
//     }
//     public void postOrderHelper(TreeNode root,List<Integer> ans){
//         if(root==null){
//             return;
//         }
//         postOrderHelper(root.left,ans);
//         postOrderHelper(root.right,ans);
//         ans.add(root.val);
//     }
// }



class Solution {
    public List<Integer> postorderTraversal(TreeNode root){
        Stack<TreeNode> st1=new Stack<TreeNode>();
        Stack<TreeNode> st2=new Stack<TreeNode>();
        List<Integer> ans=new ArrayList<>();

        if(root==null){
            return ans;
        }

        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode curr=st1.pop();
            st2.push(curr);
            if(curr.left!=null){
                st1.push(curr.left);
            }
            if(curr.right!=null){
                st1.push(curr.right);
            }
        }
        while(!st2.isEmpty()){
            ans.add(st2.pop().val);
        }

        return ans;
    }
}