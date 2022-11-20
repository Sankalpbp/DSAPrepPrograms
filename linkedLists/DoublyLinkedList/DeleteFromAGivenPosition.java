import java.util.Scanner;

public class DeleteFromAGivenPosition {

    public static Node deleteFromAGivenPosition ( Node head, int position ) {

        if ( head == null ) {
            return head;
        }

        if ( position == 1 ) {
            Node newHead = head.next;
            if ( head.next != null ) {
                head.next.previous = null;
            }
            head.next = null;
            return newHead;
        }

        int currentPosition = 1;
        Node ptr = head; 

        while ( ptr != null && currentPosition < position ) {
            ++currentPosition;
            ptr = ptr.next;
        }

        if ( ptr == null ) {
            System.out.println ( "The position doesn't exist in the Linked list." );
            return head;
        }

        Node ptrPrevious = ptr.previous;
        Node ptrNext = ptr.next;

        ptrPrevious.next = ptrNext;
        if ( ptrNext != null ) {
            ptrNext.previous = ptrPrevious;
        }

        ptr.next = null;
        ptr.previous = null;

        return head;
    }

    public static void main ( String... args ) {

        Node dll = CreateList.createList ();

        System.out.print ( "Enter the position from where you want to delete the node: " );
        dll = deleteFromAGivenPosition ( dll, ( new Scanner ( System.in ) ).nextInt () );

        CreateList.printList ( dll );
        CreateList.printListReverse ( dll );
    }
}
