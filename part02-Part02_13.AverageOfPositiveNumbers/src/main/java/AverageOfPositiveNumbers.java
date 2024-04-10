
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numbers = 0;

        while (true) {
            int numberInput = Integer.valueOf(scanner.nextLine());

            if (numberInput == 0) {
                break;
            }
            if (numberInput > 0) {
                sum += numberInput;
                numbers++;
            }
        }
        System.out.println(numbers == 0 ? "Cannot calculate the average" : 1.0 * sum / numbers);

    }
}
