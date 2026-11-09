public class DisplayNumbers {
    public static void main(String[] args) {
        
        int[] numbers = new int[20];
       
        for (int i = 0; i < 20; i++) {
            numbers[i] = i + 1;
        }
        
        System.out.println("Numbers from 1 to 20:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i] + " ");
        }
       
        System.out.println();
    }
}


