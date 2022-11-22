import java.util.Scanner;

public class CreateSinglyList {

    private static Scanner scanner = new Scanner (System.in);

    private static boolean askUserToContinue () {

        System.out.print ( "Do you want to continue ? (Y / N): " );
        String toContinue = scanner.next ();

        return toContinue.equals ("Y")   ||
               toContinue.equals ("y")   || 
               toContinue.equals ("yes") || 
               toContinue.equals ("Yes");
    }

    public static SimpleNode createLinkedList () {
        
        System.out.print ( "Enter the value to put in the head node: " );
        int data = scanner.nextInt ();
        SimpleNode head = new SimpleNode ( data );
        SimpleNode newSimpleNode = null;

        SimpleNode pointerToLastSimpleNode = head;

        while ( askUserToContinue () ) {

            System.out.print ( "Enter the value to put in the new node: " );
            data = scanner.nextInt ();
            newSimpleNode = new SimpleNode ( data );
            
            pointerToLastSimpleNode.next = newSimpleNode;
            pointerToLastSimpleNode = pointerToLastSimpleNode.next;
        }

        return head;
    }

    public static void printLinkedList ( SimpleNode node ) {
        SimpleNode ptr = node;

        System.out.print ( "Linked List created is: " );
        while (ptr != null) {
            System.out.print ( ptr.data );
            if (ptr != null && ptr.next != null) {
                System.out.print ( " -> " );
            }
            ptr = ptr.next;
        }
        System.out.println ();
    }
    
    private static int length ( SimpleNode head ) {
        SimpleNode ptr = head;
        int len = 0;

        while ( ptr != null ) {
            ++len;
            ptr = ptr.next;
        }

        return len;
    }

    public static void main ( String... args ) {
        SimpleNode l1 = createLinkedList ();
        printLinkedList ( l1 );

        System.out.println ( "Lenght of the list: " + length ( l1 ) );
    }
}
