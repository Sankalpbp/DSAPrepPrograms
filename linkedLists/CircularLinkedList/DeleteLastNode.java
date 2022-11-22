public class DeleteLastNode {

    public static Node deleteLastNode ( Node head ) {

        if ( head == null ) {
            return null;
        }

        if ( head.next == head ) {
            return null;
        }

        Node ptr = head;
        Node preptr = null;

        while ( ptr.next != head ) {
            preptr = ptr;
            ptr = ptr.next;
        }

        preptr.next = head;
        ptr.next = null;

        return head;
    }

    public static void main ( String... args ) {
        Node cll = CreateList.createList ();
        deleteLastNode ( cll );
        CreateList.printList ( cll );
    }
}
