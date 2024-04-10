import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.grades = new Grades();
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {

            int input = Integer.valueOf(this.scanner.nextLine());
            boolean isWithinRange = input >= 0 && input <= 100;

            if (input == -1) {
                break;
            }
            if (isWithinRange) {
                this.grades.add(input);
            }

        }
        double averageOfPassingGrades = this.grades.getAverageOfPassingGrades();
        System.out.println("Point average (all): " + this.grades.getAverage());
        System.out.println("Point average (passing): " + (averageOfPassingGrades != 0 ? averageOfPassingGrades : "-"));
        System.out.println("Pass percentage: " + this.grades.getPercentageOfPassing());
        System.out.println("Grade distribution:");
        this.grades.gradeDistribution();

    }

}
