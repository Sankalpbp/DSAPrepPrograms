public class DeleteFirstNode {

    public static Node deleteFirstNode ( Node head ) {
        
        if ( head == null || head.next == head ) {
            return null;
        }

        Node lastNode = head;
        while ( lastNode.next != head ) {
            lastNode = lastNode.next;
        }

        lastNode.next = head.next;
        head.next = null;

        return lastNode.next;
    }

    public static void main ( String... args ) {
        Node cll = CreateList.createList ();
        cll = deleteFirstNode ( cll );
        if ( cll != null ) {
            CreateList.printList ( cll );
        } else {
            System.out.println ( "Empty list" );
        }
    }
}
