/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head==null||head.next==null) return null;
        Node temp = head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
            
        }
        int middle = cnt/2;
        temp=head;
        while(temp!=null){
            middle--;
            if(middle==0){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
}