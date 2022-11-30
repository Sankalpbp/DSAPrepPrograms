public class ReverseTheSinglyLinkedList {

    public static SimpleNode reverseRecursive ( SimpleNode head ) {
        if ( head == null || head.next == null ) {
            return head;
        }

        SimpleNode lastNodeOfReversedListWithoutHead = head.next;
        SimpleNode headOfReversedListWithoutHead = reverseRecursive ( head.next );
        lastNodeOfReversedListWithoutHead.next = head;

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

        CreateSinglyList.printLinkedList ( reversedList );
    }
}
