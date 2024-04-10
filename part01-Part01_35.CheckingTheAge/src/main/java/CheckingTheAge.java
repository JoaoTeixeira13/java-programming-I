
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = Integer.valueOf(scan.nextLine());

        boolean possibleAge = age >= 0 && age <= 120;

        if (possibleAge) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
