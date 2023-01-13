package class_20;
/*
 https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/submissions/379011911/
*/

public class BinarySearchTreeToGreaterSumTree {

	static int sum = 0;

	public TreeNode bstToGst(TreeNode root) {
		sum = 0;

		helper(root);
		return root;
	}

	private static void helper(TreeNode root) {
		if (root == null)
			return;

		helper(root.right);
		sum += root.val;
		root.val = sum;
		helper(root.left);
	}
}
