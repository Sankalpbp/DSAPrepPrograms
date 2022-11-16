import java.util.Scanner;

public class InsertionAtTheEnd {

    public static Node insertionAtTheEnd ( Node head ) {


        System.out.print ( DoublyLinkedListConstants.DATA_PROMPT_FOR_NEW_NODE );

        Node newNode = new Node ( new Scanner ( System.in).nextInt () );

        if ( head == null ) {
            return newNode;
        }

        Node ptr = head;

        while ( ptr != null && ptr.next != null ) {
            ptr = ptr.next;
        }

        ptr.next = newNode;
        newNode.previous = ptr;

        return head;
    }

    public static void main ( String... args ) {

        Node dll = CreateList.createList ();
        insertionAtTheEnd ( dll );
        CreateList.printList ( dll );
    }
}

