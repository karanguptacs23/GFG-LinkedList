/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    private static Node findNthNode(Node head,int k){
        Node temp = head;
        int cnt=1;
        while(temp!=null){
            if(cnt==k) return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
    public Node rotate(Node head, int k) {
        // code here
        if(head == null || k==0) return head;
        Node tail = head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        if(k%len==0) return head;
        k = k%len;
        tail.next = head;
        Node newLastNode = findNthNode(head,k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }
}