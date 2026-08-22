/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if(t1!=null) temp.next = t1;
        else temp.next = t2;
        return dummyNode.next;
    }
}