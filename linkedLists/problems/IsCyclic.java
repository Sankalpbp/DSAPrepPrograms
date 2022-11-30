import java.util.Set;
import java.util.HashSet;

public class IsCyclic {

    public static boolean isCyclicUsingHashing ( SimpleNode head ) {
        Set<SimpleNode> nodes = new HashSet<SimpleNode> ();
        SimpleNode ptr = head;

        while ( ptr != null && nodes.contains ( ptr ) == false ) {
            nodes.add ( ptr );
            ptr = ptr.next;
        }

        return ptr != null;
    }

    public static boolean isCyclicUsingFloydCycle ( SimpleNode head ) {
        SimpleNode tortoise = head;
        SimpleNode hare = head;

        while ( tortoise != null && 
                hare != null && 
                hare.next != null ) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if ( tortoise == hare ) {
                return true;
            }
        }

        return false;
    }

    public static int getCount ( SimpleNode head ) {
        SimpleNode ptr = head;
        int length = 0;

        while ( ptr != null ) {
            ++length;
            ptr = ptr.next;
        }

        return length;
    }

    public static SimpleNode getMiddleNode ( SimpleNode head ) {
        int half = getCount ( head ) / 2;

        SimpleNode ptr=  head;

        while ( half-- > 0 ) {
            ptr = ptr.next;
        }

        return ptr;
    }

    public static SimpleNode getLastNode ( SimpleNode head ) {
        SimpleNode ptr = head;

        while ( ptr.next != null ) {
            ptr = ptr.next;
        }

        return ptr;
    }

/* WRONG APPROACH 
    public static boolean isCycle ( SimpleNode head ) {
        SimpleNode ptr = head;

        while ( ptr != null ) {
            SimpleNode nextPtr = ptr.next;

            while ( nextPtr != null ) {
                if ( nextPtr.next == ptr ) {
                    return true;
                }

                nextPtr = nextPtr.next;

                System.out.println ( ptr.data + " " + nextPtr.data );
            }

            ptr = ptr.next;
        }

        return false;
    }
*/

    public static SimpleNode makeCyclic ( SimpleNode head ) {

        SimpleNode middleNode = getMiddleNode ( head );
        SimpleNode lastNode = getLastNode ( head );

        lastNode.next = middleNode;

        return head;
    }

    public static void main ( String... args ) {
        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );

        ll = makeCyclic ( ll );

        System.out.println ( isCyclicUsingHashing ( ll ) );
        System.out.println ( isCyclicUsingFloydCycle ( ll ) );
    }
}
