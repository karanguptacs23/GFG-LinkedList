/* Structure of linked list Node
class Node
{
	int data;
	Node next;
	Node(int key)
	{
		data = key;
		next = null;
	}
} */

class Solution {
	private static Node reverse(Node head) {
		Node prev = null;
		Node temp1 = head;
		while (temp1 != null) {
			Node front = temp1.next;
			temp1.next = prev;
			prev = temp1;
			temp1 = front;
		}
		return prev;
	}
	private static Node getKthNode(Node temp, int k) {
		k -= 1;
		while (temp != null && k>0) {
			k--;
			temp = temp.next;
		}
		return temp;
	}
	public Node reverseKGroup(Node head, int k) {
		// code here
		Node temp = head;
		Node prevNode = null;
		while (temp != null) {
			Node kthNode = getKthNode(temp, k);
			
			if (kthNode == null) {
				Node newHead = reverse(temp);
				
				if (prevNode != null)
					prevNode.next = newHead;
				else
					head = newHead;
				
				break;
				
			}
			Node nextNode = kthNode.next;
			kthNode.next = null;
			reverse(temp);
			if (temp == head) {
				head = kthNode;
			}
			else {
				prevNode.next = kthNode;
			}
			prevNode = temp;
			temp = nextNode;
			
		}
		return head;
	}
}
