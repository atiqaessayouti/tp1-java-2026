import java.util.Scanner;

public class LetterOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] occurrences = new int[26];

        System.out.print("Enter a string (max 100 characters): ");
        String text = scanner.nextLine().toUpperCase();


        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                occurrences[c - 'A']++;
            }
        }

        System.out.println("The string \"" + text + "\" contains:");
        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > 0) {
                char letter = (char) ('A' + i);
                System.out.println(occurrences[i] + " occurrence(s) of the letter '" + letter + "'");
            }
        }

        scanner.close();
    }
}
