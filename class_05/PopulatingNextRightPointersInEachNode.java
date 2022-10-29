package class_05;

/*
  https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
*/
public class PopulatingNextRightPointersInEachNode {

	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

	public Node connect(Node root) {
		if (root == null || (root.left == null && root.right == null))
			return root;

		Node curr = root;
		while (curr != null) {
			Node temp = curr;
			while (temp != null) {
				if (temp.left != null)
					temp.left.next = temp.right;
				if (temp.next != null && temp.right != null) {
					temp.right.next = temp.next.left;
				}
				temp = temp.next;
			}

			curr = curr.left;
		}

		return root;
	}
}
