
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int numberInput = Integer.valueOf(scanner.nextLine());

            if (numberInput == 0) {
                break;
            }
            if (numberInput < 0) {
                negativeNumbers++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumbers);
    }
}
