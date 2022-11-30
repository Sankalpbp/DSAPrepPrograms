public class FindStartOfCycle {

    public static SimpleNode getStartOfCycle ( SimpleNode head ) {
        SimpleNode hare = head;
        SimpleNode tortoise = head;

        boolean doesLoopExist = false;

        while ( tortoise != null && 
                hare != null &&
                hare.next != null ) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if ( tortoise == hare ) {
                doesLoopExist = true;
                break;
            }
        }

        tortoise = head;

        while ( tortoise != hare ) {
            tortoise = tortoise.next;
            hare = hare.next;
        }

        return tortoise;
    }

    public static void main ( String... args ) {

        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );

        ll = IsCyclic.makeCyclic ( ll );

        System.out.println ( getStartOfCycle ( ll ).data );
    }
}
