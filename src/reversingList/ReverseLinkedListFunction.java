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

	// Simple in-place iterative way
	public ListNode reverseList3(ListNode head){
		ListNode previous = null;
		
		while(head != null){
			ListNode next = head.next;
			
			head.next = previous;
			
			previous = head;
			
			head = next;
		}
		
		return previous;
		
	}
	
	// Recursive away similar to what is above
    public ListNode reverseList4(ListNode head) {
        return reverseListHelper(head,null);
    }
    
    private ListNode reverseListHelper(ListNode head, ListNode newNode){
        if(head == null){
        	// remember to return the newnode, not null
            return newNode;
        }
        
        ListNode nextNode = head.next;
        
        head.next = newNode;
        
        return reverseListHelper(nextNode,head);
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
