package reversingList;

public class ReverseLinkedListFunction {
	// Iterative solution
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

	// Recursion solution
	// public ListNode reverseList(ListNode head){
	// if(head == null || head.next == null){
	// return head;
	// }

	// ListNode reversedListHead = reverseList(head.next);

	// // 1 -> 2 -> 3 -> 4 <- 5 null
	// // 1 -> 2 -> 3 <- 4 <- 5 null
	// head.next.next = head;

	// // null <- 4 <- 5
	// // null <- 3 <- 4 <- 5
	// head.next = null;

	// // return 4
	// // return 3
	// return reversedListHead;
	// }
}
