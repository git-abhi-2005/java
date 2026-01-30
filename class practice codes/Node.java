class  Node 
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class Main
{
    Node head=null;
    void addFirst(int d)
    {
        Node newNode=new Node(d);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void traverse()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
    }
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }}
    void addMid(int d,int ele)
    {
        Node newNode=new Node(d);
        if(head==null)
        {
            head=newNode;
            return;
        } 
         Node temp=head;
     while(temp.data!=ele &&temp.next!=null)
    {
        temp=temp.next;
    }
    if(temp.data==ele && temp!=null)
    {
        newNode.next=temp.next;
        temp.next=newNode;
    }
    else
    System.out.println("element not found");

    }
    void addLast(int d)
    {
        Node newNode=new Node(d);
        if(head==null)
        {
            head=newNode;
            return;
        }
         Node temp=head;
     while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newNode;
    }
    
	public static void main(String[] args) {
	    Main m=new Main();
	   // m.traverse();
	    m.addFirst(90);
	    m.addFirst(10);
	    m.addFirst(30);
	    m.traverse();
	    System.out.println();
		System.out.println("add in last");
		m.addLast(1);
		m.addLast(2);
		m.traverse();
		System.out.println();
		System.out.println("add in Mid");
		m.addMid(12,1);
		m.traverse();
		m.addMid(111,11);
		m.traverse();
		}
}