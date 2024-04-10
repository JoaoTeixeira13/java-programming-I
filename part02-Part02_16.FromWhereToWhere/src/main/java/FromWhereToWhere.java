
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int destination = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int origin = Integer.valueOf(scanner.nextLine());

        for (int i = origin; i <= destination; i++) {
            System.out.println(i);
        }
    }
}
