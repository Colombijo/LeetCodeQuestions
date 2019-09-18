import java.awt.List;
import java.util.ArrayList;

public class UnivaluedBinaryTree {
	
	
	public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        dfs(root, list);
        return list.size() == 1;
    }
    
    public static void dfs(TreeNode root, ArrayList<TreeNode> list) {
        if (root == null) {
            return;
        }
        if (list.get(0).val != root.val) {
            list.add(root);
        }
        dfs(root.left, list);
        dfs(root.right, list);
    }

}
