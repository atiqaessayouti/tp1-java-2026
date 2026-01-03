import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter a string");
            System.out.println("2. Display the string");
            System.out.println("3. Reverse the string");
            System.out.println("4. Number of words");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    str = scanner.nextLine();
                    break;

                case 2:
                    System.out.println("String: " + str);
                    break;

                case 3:
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;

                case 4:
                    String trimmed = str.trim();
                    if (trimmed.isEmpty()) {
                        System.out.println("Number of words: 0");
                    } else {
                        String[] words = trimmed.split("\\s+");
                        System.out.println("Number of words: " + words.length);
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            if (!exit) {
                System.out.println("\nPress Enter to return to the menu...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

