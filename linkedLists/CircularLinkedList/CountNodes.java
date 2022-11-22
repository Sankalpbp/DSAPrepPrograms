import java.util.Scanner;

public class CountNodes {

    public static int getCount ( Node head ) {

        if ( head == null ) {
            return 0;
        }

        Node ptr = head.next;
        int count = 1;

        while ( ptr != head ) {
            ptr = ptr.next;
            ++count;
        }

        return count;
    }

    public static void main ( String... args ) {

        Node cll = CreateList.createList ();

        System.out.println ( getCount ( cll ) );
    }
}
