class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked {
    Node head;

    public void insertAtStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void insertAtPosition(int pos, int data) {
        if (pos == 0) {
            insertAtStart(data);
            return;
        }
        Node n = new Node(data);
        Node t = head;
        for (int i = 0; i < pos - 1; i++) {
            if (t == null) return;
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
    }

    public void deleteAtStart() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node t = head;
        while (t.next.next != null) {
            t = t.next;
        }
        t.next = null;
    }

    public void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 0) {
            deleteAtStart();
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1; i++) {
            if (t.next == null) return;
            t = t.next;
        }
        if (t.next != null)
            t.next = t.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Linked l = new Linked();

        l.insertAtStart(3);
        l.insertAtStart(1);
        l.insertAtEnd(5);
        l.insertAtEnd(7);
        l.insertAtPosition(2, 9);

        l.display();

        l.deleteAtStart();
        l.display();

        l.deleteAtEnd();
        l.display();

        l.deleteAtPosition(1);
        l.display();

        l.reverse();
        l.display();
    }
}
