package class_20;

/*
 https://leetcode.com/problems/count-good-nodes-in-binary-tree/submissions/395782382/
*/
public class CountGoodNodesInBinaryTree {

	static int count = 0;

	public int goodNodes(TreeNode root) {
		count = 0;
		traverse(root, root.val);
		return count;
	}

	private static void traverse(TreeNode root, int max) {
		if (root == null)
			return;
		if (root.val >= max) {
			max = root.val;
			count++;
		}

		traverse(root.left, max);
		traverse(root.right, max);

	}
}
