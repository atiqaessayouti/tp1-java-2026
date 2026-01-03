import java.util.Arrays;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();


        double[] grades = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        boolean exit = false;
        while (!exit) {

            System.out.println("\nChoose an operation:");
            System.out.println("1. Sort and display grades");
            System.out.println("2. Display average grade");
            System.out.println("3. Display highest and lowest grades");
            System.out.println("4. Count students with a specific grade");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Sort the array using Arrays.sort()
                    Arrays.sort(grades);
                    System.out.println("Sorted grades: " + Arrays.toString(grades));
                    break;

                case 2:
                    double sum = 0;
                    for (double grade : grades) {
                        sum += grade;
                    }
                    double average = sum / grades.length;
                    System.out.println("Average grade: " + average);
                    break;

                case 3:
                    // Find min and max
                    double min = grades[0];
                    double max = grades[0];
                    for (double grade : grades) {
                        if (grade < min) min = grade;
                        if (grade > max) max = grade;
                    }
                    System.out.println("Lowest grade: " + min);
                    System.out.println("Highest grade: " + max);
                    break;

                case 4:
                    System.out.print("Enter the grade to count: ");
                    double targetGrade = scanner.nextDouble();
                    int count = 0;
                    for (double grade : grades) {
                        if (grade == targetGrade) count++;
                    }
                    System.out.println("Number of students with grade " + targetGrade + ": " + count);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
