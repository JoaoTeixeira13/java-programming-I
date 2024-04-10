
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = Integer.valueOf(scanner.nextLine());
        int secondInput = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(firstInput + secondInput);
        System.out.println(squareRoot);

    }
}
