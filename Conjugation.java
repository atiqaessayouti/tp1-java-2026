import java.util.Scanner;

public class Conjugation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first-group verb (ending in -er): ");
        String verb = scanner.nextLine().trim().toLowerCase();


        if (!verb.endsWith("er")) {
            System.out.println("This is not a first-group verb.");
        } else {
            String stem = verb.substring(0, verb.length() - 2);

            System.out.println("➔ je " + stem + "e");
            System.out.println("➔ tu " + stem + "es");
            System.out.println("➔ il/elle " + stem + "e");
            System.out.println("➔ nous " + stem + "ons");
            System.out.println("➔ vous " + stem + "ez");
            System.out.println("➔ ils/elles " + stem + "ent");
        }

        scanner.close();
    }
}
