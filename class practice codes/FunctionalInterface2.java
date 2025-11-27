import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

@FunctionalInterface
interface Square{
    int calculateArea( int a);

//    abstract int calculateArea();
//    static int calculateArea();
}

public class FunctionalInterface2 {
//    public static int calcArea(int a){
//        int area = a*a;
//        return area;
//    }
    public static void main(String[] args) {

        Square s = (int x)-> x*x;
        int area= s.calculateArea(5);
        System.out.println(area);

        Predicate<Integer> isEven =n-> n%2==0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(10));

        Consumer<String> printer = msg-> System.out.println(msg);
        printer.accept("Hello");
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        System.out.println("Random: " + randomSupplier.get());


        Function<String, Integer> stringLength = p -> p.length();

        System.out.println(stringLength.apply("Ayush")); // 5


    }
}