import java.util.Scanner;

public class DeleteNodeFromCertainPosition {

    private static void printList ( Node head ) {

        if ( head == null ) {
            System.out.println ( "Empty List" );
            return;
        }

        Node ptr = head;

        while ( ptr != null ) {
            System.out.print ( ptr.data );
            if ( ptr.next != null ) {
                System.out.print ( " -> " );
            }
            ptr = ptr.next;
        }

        System.out.println ();
    }

    public static Node deleteNodeFromCertainPosition ( Node head, int position ) {

        if ( position <= 0 ) {
            System.out.println ( "Please provide a valid position" );
            System.out.println ( "No deletion performed" );
            return head;
        }

        int currentPosition = 1;
        Node ptr = head; 
        Node preptr = null;

        while ( ptr != null && currentPosition <= position ) {
            preptr = ptr;
            ptr = ptr.next;
            ++currentPosition;
        }

        if ( ptr == null ) {
            System.out.println ( "Sorry, the list is not as long as you might think it to be." );
            return head;
        }

        if ( preptr == null ) {
            return head.next;
        }

        preptr.next = ptr.next;
        return head;
    }

    public static void main ( String... args ) {

        Node ll = CreateLinkedList.createLinkedList ();

        ll = deleteNodeFromCertainPosition ( ll, ( new Scanner ( System.in ) ).nextInt ()  );

        printList ( ll );
    }
}
