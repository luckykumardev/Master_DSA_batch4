package class_20;

import java.util.LinkedList;
import java.util.Queue;

/*
 https://leetcode.com/problems/check-completeness-of-a-binary-tree/description/
*/
public class CheckCompletenessOfABinaryTree {
	public boolean isCompleteTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean foundNull = false;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				TreeNode node = queue.remove();
				if (node == null) {
					foundNull = true;
				} else {
					if (foundNull) {
						return false;
					}
					queue.add(node.left);
					queue.add(node.right);
				}
				size--;
			}
		}
		return true;
	}
}
