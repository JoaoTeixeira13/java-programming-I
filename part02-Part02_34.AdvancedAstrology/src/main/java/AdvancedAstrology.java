
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int emptySpaces = size - 1;
        for (int i = 0; i < size; i++) {
            printSpaces(emptySpaces);
            printStars(i + 1);
            emptySpaces--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int emptySpaces = height - 1;
        for (int i = 0; i < height; i++) {
            printSpaces(emptySpaces);
            printStars(i + 1 + i);
            emptySpaces--;
        }

        printBaseLine(height);
        printBaseLine(height);
    }

    public static void printBaseLine(int height) {
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
