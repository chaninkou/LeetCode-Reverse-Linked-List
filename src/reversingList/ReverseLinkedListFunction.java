package reversingList;

public class ReverseLinkedListFunction {
	// Iterative solution better O(n) time, but O(1) space
	public ListNode reverseList(ListNode head) {
		ListNode previousHead = null;
		ListNode current = head;
		ListNode nextNode = null;
		// p c n
		// null < 1 < 2 3 > 4 > 5

		while (current != null) {
			// Set the next node first before we update current.next
			nextNode = current.next;

			// Set current.next = previous before we update previous
			current.next = previousHead;

			// Set the previous to current before we update current
			previousHead = current;

			// update currrent to the next node that we kept track of
			current = nextNode;
		}

		// We are not return current because current is node, but previous is the head of the new reserved list
		return previousHead;
	}

	// Recursion solution, O(n) time but O(n) space because call stack
	 public ListNode reverseList2(ListNode head){
		 // When it gets to the end of the node, return that head as newHead
		 // head == null is in case there is not a linked list at all
		 if(head == null || head.next == null){
			 return head;
		 }
		 
		 // Keep reversing the next node
		 ListNode newHead = reverseList2(head.next);
	
		 // 1 -> 2 -> 3 -> 4 <- 5 null
		 // 1 -> 2 -> 3 <- 4 <- 5 null
		 // This will make the next node to point back to current node
		 head.next.next = head;
	
		 // null <- 4 <- 5
		 // null <- 3 <- 4 <- 5
		 // null as place holder
		 head.next = null;

		 // return 5
		 // return 4
		 // return 3
		 // Returning the new head
		 return newHead;
	 }
}
