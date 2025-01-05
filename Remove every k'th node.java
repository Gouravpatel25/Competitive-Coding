/*
Given a singly linked list, your task is to remove every kth node from the linked list. 
Examples:
Input: Linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8, k = 2
Output: 1 -> 3 -> 5 -> 7
Explanation: After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 -> 7.

Input: Linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3
Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
Explanation: After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.

Expected Time Complexity:  O(n)
Expected Auxiliary Space:  O(1)
*/

class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        
        if (k == 1) {
            return null;
        }

        Node temp = head;
        Node prev = null;
        int i = 1; // Start the counter from 1

        while (temp != null) {
            // If the counter reaches k, we remove the node
            if (i == k) {
                if (prev != null) {
                    prev.next = temp.next; // Skip the k-th node
                }
                i = 1; // Reset counter to 1 after deletion
            } else {
                i++; // Increment counter
                prev = temp; // Move prev to current node
            }
            temp = temp.next; // Move temp to next node
        }

        return head;
    }
}
