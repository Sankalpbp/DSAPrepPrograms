import java.util.Scanner;

public class InsertionAtGivenPosition {

    private static Scanner scanner = new Scanner ( System.in );

    public static Node insertionAtGivenPosition ( Node head, int position ) {

        Node ptr = head;
        int currentPosition = 1;

        if ( position == 1 ) {
            return InsertionAtTheBeginning.insertAtTheBeginning ( head );
        }

        while ( ptr != null && currentPosition < ( position - 1 ) ) {
            ptr = ptr.next;
            ++currentPosition;
        }

        if ( ptr == null ) {
            System.out.println ( "The linked list is not as long as you think it might be..." );
            System.out.println ( "Insertion is - hence - not possible..." );
            return head;
        }

        Node newNode = new Node ( scanner.nextInt () );
        Node nextToPtr = ptr.next;

        ptr.next = newNode;
        newNode.previous = ptr;
        newNode.next = nextToPtr;
        nextToPtr.previous = newNode;

        return head;
    }

    public static void main ( String... args ) {
        Node dll = CreateList.createList ();
        System.out.print ( "Enter the position where to put your new node: " );
        dll = insertionAtGivenPosition ( dll, scanner.nextInt () );
        CreateList.printList ( dll );
        CreateList.printListReverse ( dll );
    }
}
