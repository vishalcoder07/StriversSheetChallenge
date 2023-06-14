/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node headA, Node headB) {
        Node A = headA;
        Node B = headB;
        
        while(A != B){
            A = A == null ? A = headB : A.next;
            B = B == null ? B = headA : B.next;
        }
        
        return A.data;
    }
}




