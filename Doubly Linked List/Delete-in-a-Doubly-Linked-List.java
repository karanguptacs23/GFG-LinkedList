/* Structure of a Doubly Linked List Node
class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
}
*/
class Solution {
	public Node delPos(Node head, int x) {
	    // Empty list
		if (head == null)
			return null;
		
		Node temp = head;
		int cnt = 0;
		
		while (temp != null) {
			cnt++;
			if (cnt == x)
				break;
			temp = temp.next;
		}
		Node prev = temp.prev;
		// Single Node
		if (prev == null && temp.next == null) return null; 
		
		// Head Case
		if (prev == null) {
			head = head.next;
			head.prev = null;
			return head;
		}
		// Tail Case
		else if (temp.next == null) {
			prev.next = null;
			return head;
			
		}
		// Middle Case
		prev.next = temp.next;
		temp.next.prev = prev;
		return head;
	}
}
