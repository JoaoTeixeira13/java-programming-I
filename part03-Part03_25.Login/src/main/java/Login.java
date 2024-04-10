
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        boolean isAlexLogging = username.equals("alex") && password.equals("sunshine");
        boolean isEmmaLogging = username.equals("emma") && password.equals("haskell");

        boolean isUserValid = isAlexLogging || isEmmaLogging;

        System.out.println(isUserValid ? "You have successfully logged in!" : "Incorrect username or password!");

    }
}
