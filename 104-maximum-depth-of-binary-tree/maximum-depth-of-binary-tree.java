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
    public int maxDepth(TreeNode root) {
int maxHeight=0;
        int h=maxHeight(root,maxHeight);
        return h;
    }
    private int maxHeight(TreeNode root, int maxHeight){

    if(root==null) return 0;
    int lefth=maxHeight(root.left,maxHeight);
    int righth=maxHeight(root.right,maxHeight);
    maxHeight=Math.max(lefth,righth)+1;
    return maxHeight;
    }
}