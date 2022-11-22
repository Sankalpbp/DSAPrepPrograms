import java.util.Scanner;

public class InsertAtTheBeginning {

    public static Node insertAtTheBeginning ( Node head, int data ) {

        Node newHead = new Node ( data );
        newHead.next = newHead;

        if ( head == null ) {
            return newHead;
        }

        Node lastNode = head;

        while ( lastNode.next != head ) {
            lastNode = lastNode.next;
        }

        newHead.next = head;
        lastNode.next = newHead;

        return newHead;
    }
    
    public static void main ( String... args ) {
        Node cll = CreateList.createList ();
        System.out.println ( "Enter the value of the new head you want to introduce: " );
        cll = insertAtTheBeginning ( cll, ( new Scanner ( System.in ) ).nextInt () );
        CreateList.printList ( cll );
    }
}
