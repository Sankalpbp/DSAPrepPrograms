public class Node {
    public int data;
    public Node next;

    public Node () {
        this.data = 0;
        this.next = null;
    }

    public Node ( int data ) {
        this.data = data;
        this.next = null;
    }

    public Node ( Node next ) {
        this.data = 0;
        this.next = next;
    }

    public Node ( int data, Node next ) {
        this.data = data;
        this.next = next;
    }

    public Node ( Node next, int data ) {
        this.next = next;
        this.data = data;
    }

    public void setData ( int data ) {
        this.data = data;
    }

    public void setNext ( Node next ) {
        this.next = next;
    }

    public int getData () {
        return this.data;
    }

    public Node getNext () {
        return this.next;
    }
}
