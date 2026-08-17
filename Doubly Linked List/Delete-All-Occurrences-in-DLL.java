/* Structure of Doubly Linked List
class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int x) {
		data = x;
		next = null;
		prev = null;
	}
}
*/
class Solution {
	static Node deleteAllOccurOfX(Node head, int x) {
		// code here
		Node temp = head;
		while (temp != null) {
			if (temp.data == x) {
				if (temp == head) {
					head = head.next;
				}
				Node prevNode = temp.prev;
				Node nextNode = temp.next;
				if (prevNode != null)
					prevNode.next = nextNode;
				if (nextNode != null)
					nextNode.prev = prevNode;
				
				temp = nextNode;
				
			}
			else{
			    temp = temp.next;
			}
			
		}
		return head;
		
		
	}
}
