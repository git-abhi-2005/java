public class Linkedlist {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 3, 90, 112, 34 };
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int smaller = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    smaller = arr[j];
                    break;
                }
            }
            result[i] = smaller;
        }

        System.out.print("arr: ");
        for (int v : arr)
            System.out.print(v + " ");
        System.out.println();

        System.out.print("next smaller: ");
        for (int v : result)
            System.out.print(v + " ");
        System.out.println();
    }
}
