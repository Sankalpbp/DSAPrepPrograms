import java.util.Scanner;

public class AddNodeAtCertainPosition {

    private static Scanner scanner = new Scanner ( System.in );

    private static void printList ( Node head ) {

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

    public static void addNodeAtCertainPosition ( Node head, int data , int position ) {

        if ( position == 1 ) {
            head = AddNodeInFront.addNodeInFront ( head, data );
            return;
        }

        Node ptr = head;
        int currentPosition = 1;

        while ( ptr != null && currentPosition <= position - 1 ) {
            ptr = ptr.next;
            ++currentPosition;
        }

        Node newNode = new Node ( data );

        if ( ptr.next != null ) {
            newNode.next = ptr.next;
        } 

        ptr.next = newNode;
    }

    public static void main ( String... args ) {
        Node ll = CreateLinkedList.createLinkedList ();
        printList ( ll );
        addNodeAtCertainPosition ( ll, scanner.nextInt (), scanner.nextInt () );
        printList ( ll );
    }
}
