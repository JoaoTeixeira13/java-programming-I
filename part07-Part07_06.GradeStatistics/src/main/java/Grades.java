import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> grades;
    private int passingGrades;

    public Grades() {
        this.grades = new ArrayList<>();
        this.passingGrades = 0;
    }

    public void add(int grade) {
        this.grades.add(grade);
        if (grade >= 50) {
            this.passingGrades++;
        }
    }

    public double getAverage() {
        int total = 0;

        for (int grade : this.grades) {
            total += grade;
        }

        return Math.round(10.0 * total / this.grades.size()) / 10.0;
    }

    public double getAverageOfPassingGrades() {
        int total = 0;

        for (int grade : this.grades) {
            if (grade >= 50) {
                total += grade;
            }
        }

        return Math.round(10.0 * total / this.passingGrades) / 10.0;
    }

    public double getPercentageOfPassing() {

        if (this.passingGrades == 0) {
            return 0.0;
        }

        return 10.0 * (100 * this.passingGrades) / this.grades.size() / 10.0;

    }

    public void gradeDistribution() {

        ArrayList<Integer> gradeDistribution = new ArrayList<>();

        for (int grade : this.grades) {
            int score = 0;
            switch (grade / 10) {
                case 9:
                    score = 5;
                    break;
                case 8:
                    score = 4;
                    break;
                case 7:
                    score = 3;
                    break;
                case 6:
                    score = 2;
                    break;
                case 5:
                    score = 1;
                    break;
                default:
                    score = 0;
                    break;
            }
            gradeDistribution.add(score);
        }

        printStars(gradeDistribution);
    }

    public void printStars(ArrayList<Integer> gradeDistribution) {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int grade : gradeDistribution) {
                if (grade == i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

}
