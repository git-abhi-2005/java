import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (half-height, positive integer): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("n should be a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");

            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int s = 0; s < 2 * i - 3; s++)
                    System.out.print(" ");
                System.out.println("*");
            }
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < n - i; s++)
                System.out.print(" ");

            if (i == 1) {
                System.out.println("*");
            } else {
                System.out.print("*");
                for (int s = 0; s < 2 * i - 3; s++)
                    System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}