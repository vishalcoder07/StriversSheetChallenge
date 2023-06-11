import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
 /*
    Time Complexity:O(N)
    Space Complexity:O(1)
    
    Where N is number of nodes in Linked List.
*/

public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {

        // Creating node for remembering previous node in Linked List.
        LinkedListNode<Integer> prev = null;

        // Creating temporory node.
        LinkedListNode<Integer> current = head;

        while (current != null) 
        {
            LinkedListNode<Integer> nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Return reverse Linked List.
        return prev;
    }
} 
