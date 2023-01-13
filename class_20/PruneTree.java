package class_20;
/*
 https://leetcode.com/problems/binary-tree-pruning/submissions/369583237/
*/
public class PruneTree {
	public TreeNode pruneTree(TreeNode root) {
		if (root == null)
			return root;

		helper(root);
		return root;
	}

	private static boolean helper(TreeNode root) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null) {
			if (root.val == 1)
				return true;
			else
				return false;
		}

		boolean Left_contains_one = helper(root.left);
		if (Left_contains_one == false)
			root.left = null;
		boolean Right_contains_one = helper(root.right);
		if (Right_contains_one == false)
			root.right = null;

		boolean curr = false;
		if (root.val == 1)
			curr = true;
		return curr || Left_contains_one || Right_contains_one;
	}
}
