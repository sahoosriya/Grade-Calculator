import java.util.Scanner;

public class Calculate{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = new String[numSubjects];
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextLine();

            while (true) {
                System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
                marks[i] = scanner.nextInt();
                scanner.nextLine();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter marks between 0 and 100.");
                }
            }

            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nSubject-wise Marks:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
