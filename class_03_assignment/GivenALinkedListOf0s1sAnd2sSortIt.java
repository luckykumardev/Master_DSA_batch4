package class_03_assignment;


public class GivenALinkedListOf0s1sAnd2sSortIt {
	 class Node {
			int value;
			Node next;
			
			Node(int value) {
				this.value = value;
			}
		}

	 
	void linksort(Node head) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		Node out = head;
		Node temp = head;
		while (temp != null) {
			if (temp.value == 0) {
				count0++;
			}
			if (temp.value == 1) {
				count1++;
			}
			if (temp.value == 2) {
				count2++;
			}
			temp = temp.next;
		}

		int total = count0 + count1 + count2;

		for (int i = 0; i < count0; i++) {
			out.value = 0;
			out = out.next;
		}

		for (int j = 0; j < count1; j++) {
			out.value = 1;
			out = out.next;
		}

		for (int k = 0; k < count2; k++) {
			out.value = 2;
			out = out.next;

		}

	}
}
