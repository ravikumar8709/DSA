
public class SinglyLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insertHead(Node head, int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        return head;
    }

    static Node insertTail(Node head, int data) {
        Node newnode = new Node(data);
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    static Node insertAnywhere(Node head, int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 0) {
            return insertHead(head, data);
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    static Node deleteHead(Node head) {
        if (head != null) {
            head = head.next;
        }
        return head;
    }

    static Node deletetail(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    static Node deleteAtanyposition(Node head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    static int search(Node head, int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // head = insertHead(head, 30);
        // head = insertTail(head, 60);
        // head = insertAnywhere(head, 70, 2);
        // head = deleteHead(head);
        // head = deletetail(head);
        // head = deleteAtanyposition(head, 2);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        int result = search(head, 30);
        System.out.println(result);
    }
}
