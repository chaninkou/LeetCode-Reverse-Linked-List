package reversingList;

public class Main {
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next= new ListNode(5);
		
		System.out.println("Input Linked List: ");
		displayLinkedList(head);
		
		ReverseLinkedListFunction solution = new ReverseLinkedListFunction();
		
		System.out.println("Reverse Linked List: ");
		displayLinkedList(solution.reverseList4(head));
		
	}
	
	public static void displayLinkedList(ListNode head){
		ListNode current = head;
		
		while(current != null){
			if(current.next == null){
				System.out.print(current.val);
			} else {
				System.out.print(current.val + " -> ");
			}
			
			current = current.next;
		}
		
		System.out.println(" ");
	}
}
