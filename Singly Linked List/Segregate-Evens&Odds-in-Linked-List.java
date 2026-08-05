/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/
import java.util.ArrayList;
class Solution {
    Node divide(Node head) {
        // code here
        if(head == null || head.next == null)  return head;
        ArrayList<Integer> arrE = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            if(temp.data%2==0){
                arrE.add(temp.data);
            }
            else{
                arrO.add(temp.data);
            }
            temp = temp.next;
        }
        arrE.addAll(arrO);
        int i=0;
        temp = head;
        while(temp!=null){
            temp.data = arrE.get(i);
            i++;
            temp= temp.next;
        }
        return head;
    }
}