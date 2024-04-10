
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");

        int year = Integer.valueOf(scan.nextLine());

        boolean divisibleByFour = year % 4 == 0;
        boolean divisibleByHundred = year % 100 == 0;
        boolean divisibleByFourHundred = year % 400 == 0;
        boolean isLeapYear;

        if (divisibleByFour) {
            if (divisibleByHundred) {
                if (divisibleByFourHundred) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        System.out.println(isLeapYear ? "The year is a leap year." : "The year is not a leap year.");
    }
}
