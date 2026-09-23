import java.util.Arrays;
import java.util.Scanner;
public class SortAndCalculateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter array elements:");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / n));
        scanner.close();
    }
}