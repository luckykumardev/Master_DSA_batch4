package class_03_assignment;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		int size = 0;
		ListNode temp = head;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		int k = size / 2 - 1;
		temp = head;
		while (k-- > 0) {
			temp = temp.next;
		}
		ListNode head2 = null;
		if (size % 2 == 0) {
			head2 = temp.next;
		} else {
			head2 = temp.next.next;
		}
		temp.next = null;
		head2 = reverse(head2);
		boolean isSame = check(head, head2);

		return isSame;
	}

	private static ListNode reverse(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	private static boolean check(ListNode head1, ListNode head2) {

		while (head1 != null && head2 != null) {
			if (head1.val != head2.val)
				return false;
			head1 = head1.next;
			head2 = head2.next;
		}

		return true;
	}
}
