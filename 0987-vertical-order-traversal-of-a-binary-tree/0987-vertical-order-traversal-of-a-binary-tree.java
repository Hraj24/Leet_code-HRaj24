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



// class Tuple{
//     TreeNode node;
//     int row;
//     int col;
//     public Tuple(TreeNode node,int row,int col){
//         this.node=node;
//         this.row=row;
//         this.col=col;
//     }
// }
// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
//         Queue<Tuple> q=new LinkedList<>();
//         q.offer(new Tuple(root,0,0));
//         while(!q.isEmpty()){
//             Tuple tuple=q.poll();
//             TreeNode node=tuple.node;
//             int x=tuple.row;
//             int y=tuple.col;

//             if(!map.containsKey(x)){
//                 map.put(x,new TreeMap<>());
//             }
//             if(!map.get(x).containsKey(y)){
//                 map.get(x).put(y,new PriorityQueue<>());
//             }
//             map.get(x).get(y).offer(node.val);

//             if(node.left!=null){
//                 q.offer(new Tuple(node.left,x-1,y+1));
//             }
//             if(node.right!=null){
//                 q.offer(new Tuple(node.right,x+1,y+1));
//             }
//         }

//         List<List<Integer>> list=new ArrayList<>();
//         for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
//             list.add(new ArrayList<>());
//             for(PriorityQueue<Integer> nodes:ys.values()){
//                 while(!nodes.isEmpty()){
//                     System.out.println(nodes.peek());
//                     list.get(list.size()-1).add(nodes.poll());
//                 }
//             }
//         }
//         return list;
//     }
// }




class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes = new ArrayList<>();
        
        dfs(root, 0, 0, nodes);

        nodes.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);     
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);     
            return Integer.compare(a[2], b[2]);                       
        });

        List<List<Integer>> result = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        
        for (int[] node : nodes) {
            int col = node[0], val = node[2];
            if (col != prevCol) {
                result.add(new ArrayList<>());
                prevCol = col;
            }
            result.get(result.size() - 1).add(val);
        }

        return result;
    }  
    private void dfs(TreeNode node, int row, int col, List<int[]> nodes) {
        if (node == null) return;
        nodes.add(new int[]{col, row, node.val});
        dfs(node.left, row + 1, col - 1, nodes);   
        dfs(node.right, row + 1, col + 1, nodes);  
    }
}