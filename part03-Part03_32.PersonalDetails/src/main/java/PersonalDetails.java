
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int numberOfPeople = 0;
        int ageSum = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int nameLength = parts[0].length();
            if (nameLength > longestName.length()) {
                longestName = parts[0];
            }
            ageSum += Integer.valueOf(parts[1]);
            numberOfPeople++;

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + 1.0 * ageSum / numberOfPeople);

    }
}
