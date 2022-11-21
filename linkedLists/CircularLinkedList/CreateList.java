import java.util.Scanner;

public class CreateList {

    private static Scanner scanner = new Scanner ( System.in );

    public static boolean askUserForInput () {

        System.out.print ( "Do you want to continue... ? ( Y / N ): " );
        String input = scanner.next ();

        return ( "Y".equals   ( input ) ||
                 "y".equals   ( input ) ||
                 "Yes".equals ( input ) ||
                 "yes".equals ( input ) 
               );
    }


    public static Node createList () {
        System.out.print ( "Enter the data for head node: " );
        Node head = new Node ( scanner.nextInt () );

        head.next = head;
        Node ptr = head;

        while ( askUserForInput () ) {
            System.out.print ( "Enter the data for the new node: " );
            Node newNode = new Node ( scanner.nextInt () );
            ptr.next = newNode;
            ptr = newNode;
            newNode.next = head;
        }

        return head;
    }

    public static void printList ( Node head ) {
        Node ptr = head;

        while ( ptr.next != head ) {
            System.out.print ( ptr.data );
            if ( ptr.next != head ) {
                System.out.print ( " -> " );
            }
            ptr = ptr.next;
        }

        System.out.println ( ptr.data );
    }

    public static void main ( String... args ) {
        Node cll = createList ();
        printList ( cll );
    }
}
