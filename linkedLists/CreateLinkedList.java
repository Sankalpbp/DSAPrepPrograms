import java.util.Scanner;

public class CreateLinkedList {

    private static Scanner scanner = new Scanner (System.in);

    private static Node createLinkedList () {
        
        Node head = null;
        Node ptr = null;
        int x = scanner.nextInt ();

        do {
            if (head == null) {
                head = new Node (x);
                ptr = head;
            } else {
                ptr.next = new Node (x);
                ptr = ptr.next;
            }
            x = scanner.nextInt ();
        } while ( x != -1 );

        return head;
    }

    private static void printLinkedList ( Node node ) {
        Node ptr = node;

        while (ptr != null) {
            System.out.print ( ptr.data );
            if (ptr != null && ptr.next != null) {
                System.out.print ( " -> " );
            }
            ptr = ptr.next;
        }
        System.out.println ();
    }

    public static void main ( String... args ) {
        Node l1 = createLinkedList ();
        printLinkedList ( l1 );
    }
}
