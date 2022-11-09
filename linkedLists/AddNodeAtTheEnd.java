import java.util.Scanner;

public class AddNodeAtTheEnd {

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

    public static Node addNodeAtTheEnd ( Node head, int data ) {
        
        Node ptr = head;
        Node newNode = new Node ( data );

        while ( ptr != null && ptr.next != null ) {
            ptr = ptr.next;
        }

        ptr.next = newNode;
        return head;
    }

    public static void main ( String... args ) {

        Node ll = CreateLinkedList.createLinkedList ();
        System.out.print ( "Enter the value you want to put at the end of the list: " );
        ll = addNodeAtTheEnd ( ll, ( new Scanner ( System.in ).nextInt () ) );

        printList ( ll );
    }
}
