class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class CLL {
    Node head = null;

    void addFirst(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            n.next = n;
            return;
        }
        Node t = head;
        while (t.next != head)
            t = t.next;
        n.next = head;
        t.next = n;
        head = n;
    }

    void display() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    do {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } while (temp != head);
    System.out.println();
    }
}
   void addLast(int x){
        Node n = new Node(x);
        if(head==null){
            head = n;
            n.next = n;
            return;
        }
        Node t = head;
        while(t.next!=head) t=t.next;
        t.next = n;
        n.next = head;
    }

class Main {
    public static void main(String[] args) {
        CLL l = new CLL();
        l.addLast(10);
        l.addLast(20);
        l.addLast(50);
        l.addLast(40);
        l.addLast(30);
        l.display(); 
    }
}

class Main {
    public static void main(String[] args) {
        CLL l = new CLL();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(50);
        l.addFirst(40);
        l.addFirst(30);
        l.addLast(10);
        l.addLast(20);
        l.addLast(50);
        l.addLast(40);
        l.addLast(30);
        l.display();  
    }
}