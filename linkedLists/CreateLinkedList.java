import java.util.Scanner;

public class CreateLinkedList {

    private static Scanner scanner = new Scanner (System.in);

    private static boolean askUserToContinue () {

        System.out.print ( "Do you want to continue ? (Y / N): " );
        String toContinue = scanner.next ();

        return toContinue.equals ("Y")   ||
               toContinue.equals ("y")   || 
               toContinue.equals ("yes") || 
               toContinue.equals ("Yes");
    }

    private static Node createLinkedList () {
        
        System.out.print ( "Enter the value to put in the head node: " );
        int data = scanner.nextInt ();
        Node head = new Node ( data );
        Node newNode = null;

        Node pointerToLastNode = head;

        while ( askUserToContinue () ) {

            System.out.print ( "Enter the value to put in the new node: " );
            data = scanner.nextInt ();
            newNode = new Node ( data );
            
            pointerToLastNode.next = newNode;
            pointerToLastNode = pointerToLastNode.next;
        }

        return head;
    }

    private static void printLinkedList ( Node node ) {
        Node ptr = node;

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
    
    private static int length ( Node head ) {
        Node ptr = head;
        int len = 0;

        while ( ptr != null ) {
            ++len;
            ptr = ptr.next;
        }

        return len;
    }

    public static void main ( String... args ) {
        Node l1 = createLinkedList ();
        printLinkedList ( l1 );

        System.out.println ( "Lenght of the list: " + length ( l1 ) );
    }
}
