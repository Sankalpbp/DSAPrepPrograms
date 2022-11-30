public class CalculateLengthOfCycle {

    public static int getLengthOfLoop ( SimpleNode head ) {

        boolean doesLoopExist = false;
        
        SimpleNode hare = head;
        SimpleNode tortoise = head;

        while ( hare != null &&
                hare.next != null && 
                tortoise != null ) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if ( hare == tortoise ) {
                doesLoopExist = true;
                break;
            }
        }

        int count = 1;
        hare = hare.next;
        while ( hare != tortoise ) {
            hare = hare.next;
            ++count;
        }

        return count;
    }

    public static void main ( String... args ) {
        SimpleNode ll = CreateSinglyList.createLinkedList ();
        CreateSinglyList.printLinkedList ( ll );

        ll = IsCyclic.makeCyclic ( ll );

        System.out.println ( "Length of the loop is: " + getLengthOfLoop ( ll ) );
    }
}
