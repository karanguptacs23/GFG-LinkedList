/* structure of list node:

class Node
{
	int data;
	Node next;
	Node(int val)
	{
		data = val;
		next = null;
	}
}

*/

class Solution {
	public Node findIntersection(Node head1, Node head2) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<>();
		Node temp = head2;
		while (temp != null) {
			map.put(temp.data, 1);
			temp = temp.next;
		}
		LinkedList<Integer> list = new LinkedList<>();
		temp = head1;
		while (temp != null) {
			if (map.containsKey(temp.data)) {
				list.add(temp.data);
			}
			temp = temp.next;
		}
		if (list.isEmpty())
			return null;
		Node head = new Node(list.get(0));
		Node temp1 = head;
		
		for (int i = 1; i < list.size(); i++) {
			Node newNode = new Node(list.get(i));
			temp1.next = newNode;
			temp1 = newNode;
		}
		return head;
		
	}
}
