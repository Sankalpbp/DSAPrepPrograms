import java.util.Scanner;

public class InsertInSortedLL {

    public static SimpleNode insertInSorted ( SimpleNode head, int data ) {
        SimpleNode ptr = head;
        SimpleNode preptr = null;

        while ( ptr != null && ptr.data < data ) {
            preptr = ptr;
            ptr = ptr.next;
        }

        SimpleNode newNode = new SimpleNode ( data );

        newNode.next = ptr;
        preptr.next = newNode;

        return head;
    }

    public static void main ( String... args ) {

        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );

        System.out.print ( "Enter the data you want to enter in the list: " );
        ll = insertInSorted ( ll, ( new Scanner ( System.in ).nextInt () ) );

        CreateSinglyList.printLinkedList ( ll );
    }
}
