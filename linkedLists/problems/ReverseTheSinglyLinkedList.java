public class ReverseTheSinglyLinkedList {

    public static SimpleNode reverseRecursive ( SimpleNode head ) {
        if ( head == null || head.next == null ) {
            return head;
        }

        SimpleNode lastNodeOfReversedListWithoutHead = head.next;
        SimpleNode headOfReversedListWithoutHead = reverseRecursive ( head.next );
        lastNodeOfReversedListWithoutHead.next = head;

        head.next = null;

        return headOfReversedListWithoutHead;
    }

    public static SimpleNode reverse ( SimpleNode head ) {

        SimpleNode previous = null;
        SimpleNode current = head;
        SimpleNode next = null;

        while ( current != null ) {
            // save the next node
            next = current.next;

            // update the references
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main ( String... args ) {
        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );
        SimpleNode reversedList = reverse ( ll );

        SimpleNode ll2 = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll2 );
        SimpleNode reversedRecursiveList = reverseRecursive ( ll2 );

        CreateSinglyList.printLinkedList ( reversedList );
        CreateSinglyList.printLinkedList ( reversedRecursiveList );
    }
}
