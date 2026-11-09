public class DisplayEvenNumbers {
    public static void main(String[] args) {
      
        int[] numbers = new int[20];
      
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1; // i starts at 0, so we add 1
        }
      
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 0; i < 20; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();
    }
}
