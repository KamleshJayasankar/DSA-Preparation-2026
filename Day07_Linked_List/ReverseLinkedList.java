public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head = reverse(head);
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
    }
}
