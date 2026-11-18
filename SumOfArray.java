import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}