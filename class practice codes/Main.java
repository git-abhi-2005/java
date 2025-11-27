// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Array ke elements dalo (space se alag): ");
// String[] parts = sc.nextLine().trim().split("\\s+");

// ArrayList<Integer> positives = new ArrayList<>();
// for (String s : parts) {
// int num = Integer.parseInt(s);
// if (num > 0) positives.add(num);
// }

// if (positives.isEmpty()) {
// System.out.println("Koi positive number nahi mila.");
// return;
// }

// int n = positives.size();
// int maxSum = 0;
// List<Integer> bestGroup = new ArrayList<>();

// for (int i = 0; i < n; i += 3) {
// int end = Math.min(i + 3, n);
// List<Integer> group = positives.subList(i, end);
// int sum = 0;
// for (int num : group) sum += num;

// if (sum > maxSum) {
// maxSum = sum;
// bestGroup = new ArrayList<>(group);
// }
// }

// System.out.println("Groups of 3 elements (ignoring negatives & zeros):");
// for (int i = 0; i < n; i += 3) {
// int end = Math.min(i + 3, n);
// System.out.println(positives.subList(i, end));
// }

// System.out.println("\nMaximum sum group: " + bestGroup);
// System.out.println("Maximum sum: " + maxSum);
// }
// }

// import java.util.*;

// class Car {
// String brand, color; int speed;
// void set(String b, String c, int s){ brand=b; color=c; speed=s; }
// void show(){ System.out.println("Brand: "+brand+"\nColor: "+color+"\nSpeed:
// "+speed+" km/h"); }
// void accel(int inc){ speed+=inc; System.out.println("New Speed: "+speed+"
// km/h"); }
// }

// public class Main {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// Car c=new Car();
// System.out.print("Brand: "); String b=sc.nextLine();
// System.out.print("Color: "); String cl=sc.nextLine();
// System.out.print("Speed: "); String sInput=sc.nextLine();
// int s=Integer.parseInt(sInput.replaceAll("[^0-9]", ""));
// c.set(b,cl,s); c.show();
// System.out.print("Increase Speed By: "); int
// inc=Integer.parseInt(sc.nextLine().replaceAll("[^0-9]", ""));
// c.accel(inc);
// }
// }

// class Car {
// String brand = "BMW";
// String color = "Red";
// int speed = 120;

// void show() {
// System.out.println("Brand: " + brand);
// System.out.println("Color: " + color);
// System.out.println("Speed: " + speed + " km/h");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Car c = new Car();
// c.show();
// }
// }

// class Car {
// String brand;
// int year;
// void display() {
// System.out.println("Brand: " + brand);
// System.out.println("Year: " + year);
// }
// }

// public class Main {
// public static void main(String[] args) {
// Car c1 = new Car();
// c1.brand = "Tata";
// c1.year = 2022;
// c1.display();
// }
// }

// abstract class vehicle {
//     String brand;
//     int speed;

//     public vehicle(String brand, int speed) {
//         this.brand = brand;
//         this.speed = speed;
//     }

//     abstract void startEngine();

//     void displayInfo() {
//         System.out.println("brand: " + brand);
//         System.out.println("speed : " + speed + "km/h");

//     }

// }

// class Car extends vehicle {
//     int seats;

//     public Car(String brand, int speed, int seats) {
//         super(brand, speed);
//     }

//     void startEngine() {
//         System.out.println("car engine starts with push button");

//     }

//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("seats" + seats);
//     }
// }

// class Bike extends vehicle {
//     boolean hasdiscbreak;

//     public Bike(String brand, int speed, boolean hasdiscbreak) {
//         super(brand, speed);
//         this.hasdiscbreak = hasdiscbreak;
//     }

//     void startEngine() {
//         System.out.println("bike starts with self start");
//     }

//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("discbreak?" + (hasdiscbreak ? "yes" : "no"));
//     }
// }

// class Truck extends vehicle {
//     int capacity;

//     public Truck(String brand, int speed, int capacity) {
//         super(brand, speed);
//         this.capacity = capacity;

//     }

//     void startEngine() {
//         System.out.println("engine starts with key");
//     }

//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("load capacity" + capacity);
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         vehicle car = new Car("toyota", 180, 5);
//         vehicle bike = new Bike("fr", 56, true);
//         vehicle truck = new Truck("VOLVO", 230, 5);
//         System.out.println("==Car details==");
//         car.startEngine();
//         car.displayInfo();
//         System.out.println("==bike details==");
//         bike.startEngine();
//         bike.displayInfo();
//         System.out.println("==truck details==");
//         truck.startEngine();
//         truck.displayInfo();

//     }
// }

