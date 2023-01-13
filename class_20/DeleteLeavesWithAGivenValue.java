package class_20;

/*
 https://leetcode.com/problems/delete-leaves-with-a-given-value/submissions/
*/
public class DeleteLeavesWithAGivenValue {

	public TreeNode removeLeafNodes(TreeNode root, int target) {
		if (root == null)
			return null;
		TreeNode ans = postOrderHelper(root, target);
		return ans;
	}

	private static TreeNode postOrderHelper(TreeNode root, int target) {
		if (root == null)
			return null;
		root.left = postOrderHelper(root.left, target);
		root.right = postOrderHelper(root.right, target);
		if (root.left == null && root.right == null && root.val == target)
			return null;
		return root;
	}

}
