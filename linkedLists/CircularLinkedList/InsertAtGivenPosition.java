import java.util.Scanner;

public class InsertAtGivenPosition {

    private static Scanner scanner = new Scanner ( System.in );

    public static Node insertAtGivenPosition ( Node head, int data , int position ) {
        if ( head == null ) {
            return null;
        }

        if ( position > CountNodes.getCount ( head ) + 1 ) {
            System.out.println ( "The position where you want to insert the node is not available." );
            return head;
        }

        if ( position == CountNodes.getCount ( head ) + 1 ) {
            return InsertAtTheEnd.insertAtTheEnd ( head, data );
        }

        if ( position == 1 ) {
            return InsertAtTheBeginning.insertAtTheBeginning ( head, data );
        }

        Node ptr = head;
        Node preptr = null;
        int currentPosition = 1;

        while ( ptr.next != head && currentPosition <= position ) {
            preptr = ptr;
            ptr = ptr.next;
            ++currentPosition;
        }

        Node newNode = new Node ( data );
        preptr.next = newNode;
        newNode.next = ptr;

        return head;
    }

    public static void main ( String... args ) {

        Node cll = CreateList.createList ();
        cll = insertAtGivenPosition ( cll, scanner.nextInt (), scanner.nextInt () );
        CreateList.printList ( cll );
    }
}
