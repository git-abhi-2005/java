import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null)
            t = t.next;
        t.next = n;
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("List empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted!");
            return;
        }
        Node t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                t.next = t.next.next;
                System.out.println("Deleted!");
                return;
            }
            t = t.next;
        }
        System.out.println("Not found!");
    }

    void display() {
        if (head == null) {
            System.out.println("List empty!");
            return;
        }
        System.out.print("List: ");
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }

    boolean search(int data) {
        Node t = head;
        while (t != null) {
            if (t.data == data)
                return true;
            t = t.next;
        }
        return false;
    }
}

public class Main27_01_2026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\n1. Insert  2. Delete  3. Display  4. Search  5. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Data: ");
                list.insert(sc.nextInt());
            } else if (ch == 2) {
                System.out.print("Data: ");
                int d = sc.nextInt();
                if (list.search(d))
                    list.delete(d);
                else
                    System.out.println("Not found!");
            } else if (ch == 3)
                list.display();
            else if (ch == 4) {
                System.out.print("Data: ");
                if (list.search(sc.nextInt()))
                    System.out.println("Found!");
                else
                    System.out.println("Not found!");
            } else if (ch == 5) {
                sc.close();
                break;
            }
        }
    }
}
