package class_20;

/*
 https://leetcode.com/problems/add-one-row-to-tree/submissions/369577105/
*/
public class AddOneRowToTree {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if (root == null)
			return root;
		if (d == 1) {
			TreeNode newroot = new TreeNode(v);
			newroot.left = root;
			return newroot;
		}
		helper(root, 1, v, d);

		return root;
	}

	private static void helper(TreeNode root, int cl, int v, int d) {
		if (root == null)
			return;

		helper(root.left, cl + 1, v, d);
		helper(root.right, cl + 1, v, d);
		if (cl == d - 1) {
			TreeNode tmp = root.left;
			root.left = new TreeNode(v);
			root.left.left = tmp;
			tmp = root.right;
			root.right = new TreeNode(v);
			root.right.right = tmp;
		}
	}
}
