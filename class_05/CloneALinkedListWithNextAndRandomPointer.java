package class_05;

import java.util.HashMap;
/*
 https://leetcode.com/problems/copy-list-with-random-pointer/submissions/387728771/
*/
public class CloneALinkedListWithNextAndRandomPointer {
	
	class Node {
	    int val;
	    Node next;
	    Node random;
	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	
	public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while(temp != null){
            hm.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            Node copiedNode =  hm.get(temp);
            copiedNode.next = hm.get(temp.next);
            copiedNode.random = hm.get(temp.random);
            temp = temp.next;
        }
        return hm.get(head);
        
    }
}