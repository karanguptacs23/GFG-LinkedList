/* Structure of Doubly Linked List Node
class Node {
	public int data;
	public Node next;
	public Node prev;
	
	public Node(int val) {
		data = val;
		next = null;
		prev = null;
	}
}; */

class Solution {
	private static Node findTail(Node head) {
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}
	
	public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
		// code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Node left = head;
		Node right = findTail(head);
		while (left.data < right.data) {
			if (left.data + right.data == target) {
				ArrayList<Integer> pair = new ArrayList<>();
				pair.add(left.data);
				pair.add(right.data);
				ans.add(pair);
				left = left.next;
				right = right.prev;
				
			}
			else if (left.data + right.data <target) {
				left = left.next;
			}
			else {
				right = right.prev;
			}
		}
		return ans;
		
	}
}