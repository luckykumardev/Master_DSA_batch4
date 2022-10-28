package class_03_assignment;

public class ConvertBinaryNumberInALinkedListToInteger {
	   public int getDecimalValue(ListNode head) {
	        ListNode newHead = reverseList(head);
	        int p=0;
	        int ans = 0;
	        while(newHead != null){
	            ans += newHead.val*Math.pow(2,p);
	            p++;
	            newHead= newHead.next;
	        }
	        return ans;
	    }
	    public ListNode reverseList(ListNode head) {
			if (head == null || head.next == null)
				return head;
			ListNode prev = null;
			ListNode curr = head;
			ListNode n = head.next;
			while (n != null) {
				curr.next = prev;
				prev = curr;
				curr = n;
				n = n.next;
			}
			curr.next = prev;
			return curr;
		}
}
