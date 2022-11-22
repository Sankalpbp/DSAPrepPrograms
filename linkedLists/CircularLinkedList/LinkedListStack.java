import java.util.Scanner;

public class LinkedListStack {

    private static Scanner scanner = new Scanner ( System.in );
    private Node top;

    public boolean isEmpty () {
        return top == null;
    }

    public void push ( int data ) {
        Node newTop = new Node ( data );
        newTop.next = top;
        top = newTop;
    }

    public Node getTop () {
        if ( top == null ) {
            System.out.println ( "Stack is Empty!" );
            return null;
        }
        return top;
    }

    public void pop () {
        if ( top == null ) {
            System.out.println ( "Stack Under Flow" );
            return;
        }

        top= top.next;
    }

    public static void main ( String... args ) {
        LinkedListStack stack = new LinkedListStack ();
        if ( stack.isEmpty () ) {
            System.out.println ( "Stack is Empty!" );
        }

        stack.push ( scanner.nextInt () );
        stack.push ( scanner.nextInt () );
        System.out.println ( stack.getTop ().data );

        stack.pop ();
        if ( stack.getTop () != null ) {
            System.out.println ( stack.getTop ().data );
        }
        stack.pop ();
    }
}
