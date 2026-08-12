/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    
    public static Node reverseLL(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head = reverseLL(head);
        int carry = 1;
        Node temp = head;
        while(temp!=null){
            temp.data = temp.data + carry;
            if(temp.data<10){
                carry = 0;
                break;
                
            }
            else{
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if(carry >0){
            head = reverseLL(head);
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        
        head = reverseLL(head);
        return head;
        
        
    }
}