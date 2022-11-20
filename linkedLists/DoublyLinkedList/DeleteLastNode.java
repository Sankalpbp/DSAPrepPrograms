public class DeleteLastNode {

    public static Node deleteLastNode ( Node head ) {

        if ( head == null || head.next == null ) {
            return null;
        }

        Node lastNode = head;
        Node preLastNode = null;

        while ( lastNode.next != null ) {
            preLastNode = lastNode;
            lastNode = lastNode.next;
        }

        preLastNode.next = null;
        lastNode.previous = null;

        return head;
    }

    public static void main ( String... args ) {

        Node dll = CreateList.createList ();
        dll = deleteLastNode ( dll );

        CreateList.printList ( dll );
        CreateList.printListReverse ( dll );
    }
}
