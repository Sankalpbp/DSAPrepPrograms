public class IsCyclic {

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

        System.out.println ( isCycle ( ll ) );
    }
}
