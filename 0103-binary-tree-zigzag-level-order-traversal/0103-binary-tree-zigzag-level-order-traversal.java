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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> ans=new ArrayList<>();
       if(root==null){
        return ans;
       }
       Deque<TreeNode> dq=new LinkedList<>();
       dq.addFirst(root);
       boolean reverse=false;
       
       while(!dq.isEmpty()){
        List<Integer> current=new ArrayList<>();
        int level=dq.size();

        for(int i=0;i<level;i++){
            if(!reverse){
                TreeNode curr=dq.pollFirst();
                current.add(curr.val);
                if(curr.left!=null){
                    dq.addLast(curr.left);
                }
                if(curr.right!=null){
                    dq.addLast(curr.right);
                }
            }else{
                TreeNode curr=dq.pollLast();
                current.add(curr.val);
                if(curr.right!=null){
                    dq.addFirst(curr.right);
                }
                if(curr.left!=null){
                    dq.addFirst(curr.left);
                }
            }
        }
        ans.add(current);
        reverse=!reverse;
       }
       return ans;
    }
}