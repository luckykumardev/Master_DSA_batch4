package class_03_assignment;
/*
 https://leetcode.com/problems/partition-list/description/	
*/	

public class PartitionList {

	public ListNode partition(ListNode head, int x) {

		ListNode dummy1 = new ListNode(-1);
		ListNode dummy2 = new ListNode(-1);

		ListNode tail1 = dummy1;
		ListNode tail2 = dummy2;

		ListNode temp = head;
		while (temp != null) {
			if (temp.val < x) {
				tail1.next = temp;
				tail1 = tail1.next;
			} else {
				tail2.next = temp;
				tail2 = tail2.next;
			}
			temp = temp.next;
		}
		tail2.next = null;
		tail1.next = dummy2.next;
		return dummy1.next;
	}

}