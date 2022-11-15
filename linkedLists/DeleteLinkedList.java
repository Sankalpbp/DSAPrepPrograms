public class DeleteLinkedList {

    private static void printList ( Node head ) {

        if ( head == null ) {
            System.out.println ( "Empty List" );
            return;
        }

        Node ptr = head;

        while ( ptr != null ) {

            System.out.print ( ptr.data );
            if (ptr.next != null ) {
                System.out.print ( " -> " );
            }

            ptr = ptr.next;
        }

        System.out.println ();
    }

    public static Node deleteList ( Node head ) {
        // well, this is funny... xD!
        return null;
    }

    public static void main ( String... args ) {
        Node ll = CreateLinkedList.createLinkedList ();

        ll = deleteList ( ll );

        printList ( ll );
    }
}
