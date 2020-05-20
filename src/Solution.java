public class Solution {

// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem

//    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {


        // my code starts here
        if(head == null){
            return head;
        }
        SinglyLinkedListNode prevNode = null;
        SinglyLinkedListNode currentNode = head;
        while (currentNode != null){
            SinglyLinkedListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
        //my code ends here


//    }

}


