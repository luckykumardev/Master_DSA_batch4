package class_03_assignment;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        ListNode ptr1 = first;
        ListNode ptr2 = second;
        
        int count = 0;
        
        while(head!=null){
            if(count%2 == 0){
                ptr1.next = head;
                head = head.next;
                ptr1 = ptr1.next;
                ptr1.next = null;
            }
            else{
                ptr2.next = head;
                head = head.next;
                ptr2 = ptr2.next;
                ptr2.next = null;
            }
            count++;
        }
        ptr1.next = second.next;
        return first.next;
    }
}
