public class ArraySquares {

    public static void main(String[] args) {

        int[] numbers = {10, 3, 4, 5, 6};

        int[] squares = new int[5];

        for (int i = 0; i < 5; i++) {

            squares[i] = numbers[i] * numbers[i];

        }

        System.out.println("Squares of the numbers:");

        for (int i = 0; i < 5; i++) {

            System.out.print(squares[i] + " ");

        }
    }
}