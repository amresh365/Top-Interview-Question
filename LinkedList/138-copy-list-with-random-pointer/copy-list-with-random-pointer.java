/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // In This step we Create a new node for each original node and insert them between the original nodes
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        //In This Step Assign random pointers for the new nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        //In This Step we are Separate the original and copied lists
        Node newHead = head.next;
        Node original = head;
        Node copied = newHead;
        while (original != null) {
            original.next = copied.next;
            original = original.next;
            if (copied.next != null) {
                copied.next = copied.next.next;
            }
            copied = copied.next;
        }

        return newHead;
    }
}