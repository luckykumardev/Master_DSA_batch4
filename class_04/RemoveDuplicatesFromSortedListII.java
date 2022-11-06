package class_04;

/*
 https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
*/

public class RemoveDuplicatesFromSortedListII {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(-1);
		ListNode curr = head;
		ListNode temp = dummy;
		temp.next = curr;
		while (curr != null) {
			while (curr.next != null && curr.val == curr.next.val) {
				curr = curr.next;
			}
			if (temp.next != curr) {
				temp.next = curr.next;
				curr = temp.next;
			} else {
				temp = temp.next;
				curr = curr.next;
			}

		}
		return dummy.next;
	}
}
