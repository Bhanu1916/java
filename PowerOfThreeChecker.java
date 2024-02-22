import java.util.Scanner;

public class PowerOfThreeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        boolean isPowerOfThree = isPowerOfThree(number);
        System.out.println("Output: " + isPowerOfThree);

        scanner.close();
    }
    private static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
