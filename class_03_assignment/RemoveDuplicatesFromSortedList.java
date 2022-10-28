package class_03_assignment;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
	       ListNode temp = head;
	        
	        while(temp !=null && temp.next != null){
	            if(temp.val == temp.next.val)
	                temp.next = temp.next.next;
	            else
	              temp = temp.next;
	        }
	        
	        return head;
	    }
}
