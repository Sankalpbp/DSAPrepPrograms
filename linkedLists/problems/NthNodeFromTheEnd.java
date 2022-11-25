import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class NthNodeFromTheEnd {

    private static Scanner scanner = new Scanner ( System.in );

    private static int getNumberOfNodesAfterX ( SimpleNode x ) {
        SimpleNode ptr = x.next;
        int count = 0;

        while ( ptr != null ) {
            ptr = ptr.next;
            ++count;
        }

        return count;
    }

    public static SimpleNode getNthNodeUsingTwoPointer ( SimpleNode head, int n ) {
        if ( checkIfNthNodeFromEndIsPossible ( head, n ) ) {
            return new SimpleNode ( -111 );
        }

        SimpleNode first = head;
        SimpleNode second = head;
        int count = 0;

        while ( second != null && count < n ) {
            second = second.next;
            ++count;
        }

        while ( second != null ) {
            first = first.next;
            second = second.next;
        }

        return first;
    }

    public static SimpleNode getNthNodeFromTheEndUsingHashTable ( SimpleNode head, int n ) {

        if ( checkIfNthNodeFromEndIsPossible ( head, n ) ) {
            return new SimpleNode ( -111 );
        }

        Map<Integer, SimpleNode> hashTable = new HashMap<Integer, SimpleNode> ();

        int position = 0;
        for ( SimpleNode ptr = head; ptr != null; ptr = ptr.next ) {
            ++position;
            hashTable.put ( position, ptr );
        }

        return hashTable.get ( position - n + 1 );
    }

    public static boolean checkIfNthNodeFromEndIsPossible ( SimpleNode head, int n ) {

        if ( getNumberOfNodesAfterX ( head ) + 1 < n ) {
            System.out.println ( "N is greater than the length of the list" );
            return true;
        }
        
        return false;
    }

    public static SimpleNode getNthNodeFromTheEndOn2 ( SimpleNode head, int n ) {

        if ( checkIfNthNodeFromEndIsPossible ( head, n ) ) {
            return new SimpleNode ( -111 );
        }

        SimpleNode ptr = head;

        while ( ptr != null && getNumberOfNodesAfterX ( ptr ) != n - 1 ) {
            ptr = ptr.next;
        }

        return ptr;
    }

    public static SimpleNode getNthNodeLinearly ( SimpleNode head, int n ) {

        if ( checkIfNthNodeFromEndIsPossible ( head, n ) ) {
            return new SimpleNode ( -111 );
        }

        int position = 1;
        SimpleNode ptr = head;

        while ( ptr != null && position < ( getNumberOfNodesAfterX ( head ) + 1 - n + 1 ) ) {
            ptr = ptr.next;
            ++position;
        }

        return ptr;
    }

    public static void main ( String... args ) {
        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );

        System.out.print ( "Enter the value of n: " );
        int n = scanner.nextInt ();

        System.out.println ( getNthNodeFromTheEndOn2 ( ll, n ).data );
        System.out.println ( getNthNodeFromTheEndUsingHashTable ( ll, n ).data );
        System.out.println ( getNthNodeLinearly ( ll, n ).data );
        System.out.println ( getNthNodeUsingTwoPointer ( ll, n ).data );
    }
}
