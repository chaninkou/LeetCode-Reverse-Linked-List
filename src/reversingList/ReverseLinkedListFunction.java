package reversingList;

public class ReverseLinkedListFunction {
	// Iterative solution better O(n) time, but O(1) space
	public ListNode reverseList(ListNode head) {
		ListNode previousHead = null;
		ListNode current = head;
		ListNode next = null;
		// p c n
		// null < 1 < 2 3 > 4 > 5

		while (current != null) {
			next = current.next;

			current.next = previousHead;

			previousHead = current;

			current = next;
		}

		return previousHead;
	}

	// Recursion solution, O(n) time but O(n) space because call stack
//	 public ListNode reverseList(ListNode head){
//		 // When it gets to the end of the node, return that head as newHead
//		 if(head == null || head.next == null){
//			 return head;
//		 }
//		 
//		 // Keep reversing the next node
//		 ListNode newHead = reverseList(head.next);
//	
//		 // 1 -> 2 -> 3 -> 4 <- 5 null
//		 // 1 -> 2 -> 3 <- 4 <- 5 null
//		 // This will make the next node to point back to current node
//		 head.next.next = head;
//	
//		 // null <- 4 <- 5
//		 // null <- 3 <- 4 <- 5
//		 // null as place holder
//		 head.next = null;
//
//		 // return 4
//		 // return 3
//		 // Returning the new head
//		 return newHead;
//	 }
}
