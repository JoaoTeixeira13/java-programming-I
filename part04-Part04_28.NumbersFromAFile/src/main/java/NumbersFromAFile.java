
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        boolean occuredException = false;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                numbers.add(Integer.valueOf(row));
            }

        } catch (Exception e) {
            occuredException = true;
            System.out.println("Reading the file " + file + " failed.");
        }
        int numberOfResults = 0;

        if (!occuredException) {
            for (int number : numbers) {
                boolean isWithinRange = number <= upperBound && number >= lowerBound;
                if (isWithinRange) {
                    numberOfResults++;
                }
            }
        }
        System.out.println("Numbers: " + numberOfResults);

    }

}
