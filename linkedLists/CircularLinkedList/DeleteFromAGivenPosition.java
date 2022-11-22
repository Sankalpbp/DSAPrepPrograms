import java.util.Scanner;

public class DeleteFromAGivenPosition {

    public static Node deleteFromAGivenPosition ( Node head, int position ) {

        if ( head == null ) {
            return null;
        }

        if ( position == 1 ) {
            return DeleteFirstNode.deleteFirstNode ( head );
        }

        if ( position == CountNodes.getCount ( head ) ) {
            return DeleteLastNode.deleteLastNode ( head );
        }

        int currentPosition = 1;
        Node ptr = head;
        Node preptr = null;

        while ( ptr.next != head && currentPosition < position ) {
            preptr = ptr;
            ptr = ptr.next;
            ++currentPosition;
        }

        preptr.next = ptr.next;
        ptr.next = null;

        return head;
    }

    public static void main ( String [] args ) {
        Node cll = CreateList.createList ();
        System.out.print ( "Enter the position from where you want to delete the node: " );
        cll = deleteFromAGivenPosition ( cll, ( new Scanner ( System.in ).nextInt () ) );
        CreateList.printList ( cll );
    }
}
