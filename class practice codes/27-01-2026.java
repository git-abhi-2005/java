import java.util.*;

class Node {
    int d; Node n;
    Node(int d){ this.d=d; }
}

class LinkedList {
    Node h;

    void insert(int d){
        Node x=new Node(d);
        if(h==null){ h=x; return; }
        Node t=h;
        while(t.n!=null) t=t.n;
        t.n=x;
    }

    void delete(int d){
        if(h==null) return;
        if(h.d==d){ h=h.n; return; }
        Node t=h;
        while(t.n!=null){
            if(t.n.d==d){ t.n=t.n.n; return; }
            t=t.n;
        }
    }

    void display(){
        for(Node t=h;t!=null;t=t.n)
            System.out.print(t.d+" -> ");
        System.out.println("null");
    }

    boolean search(int d){
        for(Node t=h;t!=null;t=t.n)
            if(t.d==d) return true;
        return false;
    }
}

public class Main {
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();

        while(true){
            System.out.println("1.Insert 2.Delete 3.Display 4.Search 5.Exit");
            int c=sc.nextInt();

            if(c==1) l.insert(sc.nextInt());
            else if(c==2) l.delete(sc.nextInt());
            else if(c==3) l.display();
            else if(c==4) System.out.println(l.search(sc.nextInt())?"Found":"Not found");
            else break;
        }
    }
}
