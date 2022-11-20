public class DeleteFirstNode {

    public static Node deleteFirstNode ( Node head ) {
        if ( head == null || head.next == null ) {
            return null;
        }

        Node newHead = head.next;
        newHead.previous = null;

        return newHead;
    }

    public static void main ( String... args ) {

        Node dll = CreateList.createList ();
        dll = deleteFirstNode ( dll );
        CreateList.printList ( dll );
        CreateList.printListReverse ( dll );
    }
}
