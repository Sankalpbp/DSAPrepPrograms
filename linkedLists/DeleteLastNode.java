public class DeleteLastNode {

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

    public static Node deleteLastNode ( Node head ) {

        if ( head == null || head.next == null ) {
            return null;
        }

        Node ptr = head;

        while ( ptr.next != null && ptr.next.next != null ) {
            ptr = ptr.next;
        }

        ptr.next = null;

        return head;
    }

    public static void main ( String... args ) {
        Node ll = CreateLinkedList.createLinkedList ();

        ll = deleteLastNode ( ll );

        printList ( ll );
    }
}
