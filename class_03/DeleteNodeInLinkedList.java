package class_03;

/*
 * first discuss normal delete
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInLinkedList {
	public void deleteNode(Node node) {
		node.data = node.next.data;
		node.next = node.next.next;
	}
}
