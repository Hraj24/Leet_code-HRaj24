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

// class Pair {
//     TreeNode node;
//     int num;

//     Pair(TreeNode _node, int _num) {
//         num = _num;
//         node = _node;
//     }
// }

// class Solution {
//     public int widthOfBinaryTree(TreeNode root) {
//         if (root == null) return 0;

//         int ans = 0;
//         Queue<Pair> q = new LinkedList<>();
//         q.offer(new Pair(root, 0));

//         while (!q.isEmpty()) {
//             int size = q.size();
//             int mmin = q.peek().num; // to make the id starting from zero

//             int first = 0, last = 0;

//             for (int i = 0; i < size; i++) {
//                 int cur_id = q.peek().num - mmin;
//                 TreeNode node = q.peek().node;
//                 q.poll();

//                 if (i == 0) first = cur_id;
//                 if (i == size - 1) last = cur_id;

//                 if (node.left != null) {
//                     q.offer(new Pair(node.left, cur_id * 2 + 1));
//                 }

//                 if (node.right != null) {
//                     q.offer(new Pair(node.right, cur_id * 2 + 2));
//                 }
//             }

//             ans = Math.max(ans, last - first + 1);
//         }

//         return ans;
//     }
// }



class Pair {
    TreeNode node;
    long index;

    Pair(TreeNode node, long index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {

            int currLevelSize = q.size();

            long stIdx = q.peek().index;
            long endIdx = ((LinkedList<Pair>) q).peekLast().index;

            maxWidth = Math.max(maxWidth, (int) (endIdx - stIdx + 1));

            for (int i = 0; i < currLevelSize; i++) {
                Pair curr = q.poll();

                if (curr.node.left != null) {
                    q.offer(new Pair(curr.node.left, curr.index * 2 + 1));
                }

                if (curr.node.right != null) {
                    q.offer(new Pair(curr.node.right, curr.index * 2 + 2));
                }
            }
        }

        return maxWidth;
    }
}