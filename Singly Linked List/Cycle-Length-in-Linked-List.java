/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = slow.next;
                int cnt=0;
                 while(slow!=fast){
                    cnt++;
                    slow = slow.next;
                    
                }
                return cnt + 1;
            }
        }
        return 0;
    }
}