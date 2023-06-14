/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node child;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.child = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.child = null;
     }
     Node(int data, Node next, Node child)
     {
         this.data = data;
         this.next = next;
         this.child = child;
     }
 }

 *****************************************************************/

public class Solution {

    static Node merge(Node A, Node B){
        Node head = new Node(0);
        Node temp = head;
        
        while(A != null && B != null){
            if(A.data <= B.data){
                temp.child = A;
                A = A.child;
            }
            else{
                temp.child = B;
                B = B.child;
            }
            temp = temp.child;
        }
        
        if(A != null) temp.child = A;
        else temp.child = B;
        
        return head.child;   
    }

    public static Node flattenLinkedList(Node root) {
        if(root == null || root.next == null) return root;
	    
	    root.next = flattenLinkedList(root.next);
	    
	    root = merge(root, root.next);
    
        return root;
    }
}
