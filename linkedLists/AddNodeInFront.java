import java.util.Scanner;

public class AddNodeInFront {

    public static Node addNode ( Node head, int data ) {
        Node newHead = new Node ( data , head );
        head = newHead;

        printList ( newHead );

        return newHead;
    }

    public static void printList ( Node head ) {
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

    public static void main (String... args) {
        Node ll = CreateLinkedList.createLinkedList ();

        System.out.println ( "Enter the element you want to insert in front of the list: " );
        int x = ( new Scanner ( System.in ) ).nextInt ();
        ll = addNode ( ll, x );
        printList ( ll );
    }
}
