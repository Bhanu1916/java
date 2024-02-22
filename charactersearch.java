import java.util.Scanner;

public class charactersearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Input character to be searched
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        // Find and print the index of the character in the string
        int index = findCharacterIndex(inputString, searchChar);
        if (index != -1) {
            System.out.println(searchChar + " is found in the string at index: " + index);
        } else {
            System.out.println(searchChar + " is not present in the string.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to find the index of a character in a string
    private static int findCharacterIndex(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1; // Return -1 if the character is not found
    }
}
