public class reverselinkedlist {
    static class Node {  
        int val;
        Node next;

        Node(int v) {
            val = v;
        }
    }

    Node head;

    void append(int v) {
        if (head == null) {
            head = new Node(v);
            return;
        }
        Node cur = head;
        while (cur.next != null)
            cur = cur.next;
        cur.next = new Node(v);
    }

    void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    void reverseIterative() {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        head = prev;
    }

    private Node reverseRecursiveHelper(Node node) {
        if (node == null || node.next == null)
            return node;
        Node newHead = reverseRecursiveHelper(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    void reverseRecursive() {
        head = reverseRecursiveHelper(head);
    }

      public static void main(String[] args) {
        reverselinkedlist list = new reverselinkedlist();
        int[] vals = { 4, 7, 3, 90, 112, 34 };
        for (int v : vals)
            list.append(v);

        System.out.print("original: ");
        list.printList();

        list.reverseIterative();
        System.out.print("reversed (iterative): ");
        list.printList();

        list.reverseRecursive();
        System.out.print("reversed back (recursive): ");
        list.printList();
    }
}
