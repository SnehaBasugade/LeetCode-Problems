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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level=1;
        int ans=level;
        int sum=root.val;
        while (!queue.isEmpty()){
            int k=queue.size();
            int currSum=0;
            for (int i=0;i<k;i++){
                TreeNode node=queue.poll();
                currSum += node.val;
                if (null != node.left){
                    queue.add(node.left);
                }
                if (null != node.right){
                    queue.add(node.right);
                } 
            }
            if (currSum>sum){
                ans=level;
                sum=currSum;
            }
            level++;
        }
        return ans;
    }
}