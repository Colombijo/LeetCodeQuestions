/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class SumOfLeftLeaves {
	int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        return searchTree(root, false);
    }
    
    public int searchTree(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && isLeft) {
            sum += root.val;
        } 
        searchTree(root.left, true);
        searchTree(root.right, false);
        return sum;
        
    }

}
