import java.util.*;
public class practice11 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        System.out.println(list);


        //Creating a object for the iterator interface
        //so we can Iterate through the list elements

        Iterator iterator = list.iterator();

        System.out.print("Forward Traversal-->");

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        iterator.remove();

        System.out.println(list);


        //Creating a object for the Listiterator interface
        //so we can Iterate through the list elements

        ListIterator listIterator = list.listIterator();


        System.out.print("Forward Traversal-->");

        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();

        System.out.print("backward Traversal-->");

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
    }
}