/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // Head Case
        if(head == null) return new Node(x);
        Node temp = head;
        int cnt=0;
        while(temp!=null){
            if(cnt==p) break;
            cnt++;
            temp=temp.next;
        }
        Node newNode = new Node(x);
        
        // Tail Case;
        if(temp.next == null){
            temp.next = newNode;
            newNode.prev = temp;
            return head;
        }
        // Middle Case
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        temp.next.next.prev = temp.next;
        return head;
    }
}