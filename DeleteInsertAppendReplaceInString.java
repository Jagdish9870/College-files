import java.util.Scanner;

public class DeleteInsertAppendReplaceInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Menu for string operations
        System.out.println("String Operations:");
        System.out.println("1. Delete a substring");
        System.out.println("2. Insert a substring");
        System.out.println("3. Append a string");
        System.out.println("4. Replace a substring");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (choice) {
            case 1:
                // Delete a substring
                System.out.print("Enter the substring to delete: ");
                String substringToDelete = scanner.nextLine();
                String deletedString = originalString.replace(substringToDelete, "");
                System.out.println("Result after deletion: " + deletedString);
                break;
            case 2:
                // Insert a substring
                System.out.print("Enter the position to insert: ");
                int positionToInsert = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter the substring to insert: ");
                String substringToInsert = scanner.nextLine();
                String insertedString = originalString.substring(0, positionToInsert) + substringToInsert + originalString.substring(positionToInsert);
                System.out.println("Result after insertion: " + insertedString);
                break;
            case 3:
                // Append a string
                System.out.print("Enter the string to append: ");
                String stringToAppend = scanner.nextLine();
                String appendedString = originalString + stringToAppend;
                System.out.println("Result after appending: " + appendedString);
                break;
            case 4:
                // Replace a substring
                System.out.print("Enter the substring to replace: ");
                String substringToReplace = scanner.nextLine();
                System.out.print("Enter the replacement string: ");
                String replacementString = scanner.nextLine();
                String replacedString = originalString.replace(substringToReplace, replacementString);
                System.out.println("Result after replacement: " + replacedString);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
