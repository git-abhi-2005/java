import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid Marks Exception");
            } else {
                if (marks >= 90) {
                    System.out.println("Grade: A");
                } else if (marks >= 80) {
                    System.out.println("Grade: B");
                } else if (marks >= 70) {
                    System.out.println("Grade: C");
                } else if (marks >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }
            }
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
