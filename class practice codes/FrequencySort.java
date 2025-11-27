import java.util.*;

public class FrequencySort {
    public static void sortByFrequency(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        
        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Arrays.sort(arr, (a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqB, freqA);
            }
            return Integer.compare(a, b);
        });
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Frequency Sort!");
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array size must be positive. Exiting.");
            return;
        }
        
        Integer[] arr = new Integer[n];
        System.out.println("Enter the " + n + " elements (integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        sortByFrequency(arr);
        
        System.out.println("Sorted array (higher frequency first, then ascending values):");
        System.out.println(Arrays.toString(arr));
        
        scanner.close();
    }
}
