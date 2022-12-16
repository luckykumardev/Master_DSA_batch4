package class_16;
/*
 https://leetcode.com/problems/symmetric-tree
*/

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		boolean ans = mirror(root, root);
		return ans;
	}

	private static boolean mirror(TreeNode r1, TreeNode r2) {
		if (r1 == null && r2 == null)
			return true;
		if (r1 == null || r2 == null)
			return false;
		if (r1.val != r2.val)
			return false;

		return mirror(r1.left, r2.right) && mirror(r1.right, r2.left);
	}
}
