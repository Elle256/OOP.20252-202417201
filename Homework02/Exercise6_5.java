import java.util.Scanner;
import java.util.Arrays;
public class Exercise6_5 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of elements in the array:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}