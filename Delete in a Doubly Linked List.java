/*
Given a Doubly Linked list and a position. The task is to delete a node from a given position (position starts from 1) in a doubly linked list and return the head of the doubly Linked list.
Examples:
Input: LinkedList = 1 <--> 3 <--> 4, x = 3
Output: 1 <--> 3
Explanation: After deleting the node at position 3 (position starts from 1),the linked list will be now as 1 <--> 3.
 
Input: LinkedList = 1 <--> 5 <--> 2 <--> 9, x = 1
Output: 5 <--> 2 <--> 9
*/

/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        
        int count=1;
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        Node temp=head;
        while(count<x){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        return head;
    }
}
