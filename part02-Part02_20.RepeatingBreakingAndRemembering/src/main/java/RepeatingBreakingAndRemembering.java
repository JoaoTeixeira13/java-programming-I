
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        System.out.println("Give numbers:");
        while (true) {
            int numericalInput = Integer.valueOf(scanner.nextLine());

            if (numericalInput == -1) {
                break;
            }
            if (numericalInput % 2 == 0) {
                evenNumbers++;
            }
            if (numericalInput % 2 != 0) {
                oddNumbers++;
            }
            sum += numericalInput;
            numbers++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + 1.0 * sum / numbers);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);

    }
}
