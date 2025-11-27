import java.util.Scanner;

public class DuplicateReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256];
        for (char ch : input.toCharArray()) {
            freq[(int) ch]++;
        }
        StringBuilder result = new StringBuilder();
        StringBuilder replaced = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (freq[(int) ch] > 1) {
                result.append('0');
                if (replaced.indexOf(String.valueOf(ch)) == -1) {
                    replaced.append(ch).append(" ");
                }
            } else {
                result.append(ch);
            }
        }
        System.out.println("Modified string: " + result.toString());
        if (replaced.length() > 0) {
            System.out.println("Replaced characters: " + replaced.toString().trim());
        } else {
            System.out.println("No characters were replaced.");
        }
        sc.close();
    }
}
