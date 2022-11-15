public class Node {

    public Node previous;
    public int data;
    public Node next;

    public Node ( Node previous, 
                  int data, 
                  Node next ) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public Node ( int data ) {
        this.previous = null;
        this.data = data;
        this.next = null;
    }

    public Node getPrevious () {
        return this.previous;
    }

    public int getData () {
        return this.data;
    }

    public Node getNext () {
        return this.next;
    }

    public void setPrevious ( Node previous ) {
        this.previous = previous;
    }

    public void setData ( int data ) {
        this.data = data;
    }

    public void setNext ( Node next ) {
        this.next = next;
    }
}
