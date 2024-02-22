import java.util.Scanner;

public class SquareRootFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (isPerfectSquare(number)) {
            int squareRoot = (int) Math.sqrt(number);
            System.out.println("Square Root: " + squareRoot + ", -" + squareRoot);
        } else {
            System.out.println("The entered number is not a perfect square.");
        }

        scanner.close();
    }
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
