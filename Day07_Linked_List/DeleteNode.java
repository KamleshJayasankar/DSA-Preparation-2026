public class DeleteNode {
    static Node delete(Node head, int value) {
        if (head == null) return null;
        if (head.data == value) return head.next;

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = delete(head, 20);

        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
    }
}
