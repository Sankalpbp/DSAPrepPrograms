import java.util.Scanner;

public class CreateList {

    private static Scanner scanner = new Scanner ( System.in );

    private static boolean askUserForInput () {
        System.out.print ( "Do you want to continue ? (Y / N): " );
        String toContinue = scanner.next ();

        return "Y".equals ( toContinue ) ||
               "y".equals ( toContinue ) ||
               "yes".equals ( toContinue ) ||
               "Yes".equals ( toContinue );
    }

    public static Node createList () {
        System.out.print ( "Enter the data to be put in the head node: " );
        Node head = new Node ( scanner.nextInt () );

        Node newNode = null;
        Node pointerToLastNode = head;


        while ( askUserForInput () ) {
            System.out.print ( "Enter the data for the new node: " );
            newNode = new Node ( scanner.nextInt () );

            newNode.previous = pointerToLastNode;
            pointerToLastNode.next = newNode;

            pointerToLastNode = newNode;
        }

        return head;
    }

    private static void printList ( Node head ) {
        Node ptr = head;

        while ( ptr != null ) {
            System.out.print ( ptr.data );
            if ( ptr.next != null ) {
                System.out.print ( " <-> " );
            }

            ptr = ptr.next;
        }

        System.out.println ();
    }

    public static void main ( String... args ) {

        Node head = createList ();
        printList ( head );
    }
}
