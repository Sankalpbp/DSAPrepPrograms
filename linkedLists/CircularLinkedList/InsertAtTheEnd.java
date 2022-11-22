import java.util.Scanner;

public class InsertAtTheEnd {

    public static Node insertAtTheEnd ( Node head, int data ) {

        Node newNode = new Node ( data );

        if ( head == null ) {
            return newNode;
        }

        Node lastNode = head;

        while ( lastNode.next != head ) {
            lastNode = lastNode.next;
        }

        newNode.next = head;
        lastNode.next = newNode;

        return head;
    }

    public static void main ( String... args ) {
        Node cll = CreateList.createList ();
        System.out.println ( "Enter the data for the new node: " );
        cll = insertAtTheEnd ( cll, ( new Scanner ( System.in ) ).nextInt () );
        CreateList.printList ( cll );
    }
}
