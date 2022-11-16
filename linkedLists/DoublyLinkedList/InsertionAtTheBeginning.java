import java.util.Scanner;

public class InsertionAtTheBeginning {

    public static Node insertAtTheBeginning ( Node head ) {
        System.out.print ( "Enter the data for the new Node: " );
        Node newNode = new Node ( ( new Scanner ( System.in ).nextInt () ) );

        newNode.next = head;
        head.previous = newNode;

        return newNode;
    }

    public static void main ( String... args ) {
        Node dll = CreateList.createList ();
        dll = insertAtTheBeginning ( dll );

        CreateList.printList ( dll );
    }
}
