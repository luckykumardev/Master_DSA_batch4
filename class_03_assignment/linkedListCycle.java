package class_03_assignment;

class ListNode {
	int val;
	ListNode next;
	
	ListNode() {
		val = 0;
		next = null;
	}
	
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class linkedListCycle {

	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		if (head == null || head.next == null) {
			return false;
		}
		boolean ans = false;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				ans = true;
				break;
			}
		}

		return ans;

	}
}
