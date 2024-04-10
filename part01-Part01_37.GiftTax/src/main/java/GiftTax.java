
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");

        int giftValue = Integer.valueOf(scan.nextLine());

        double dueTax;

        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else {
            if (giftValue < 25000) {
                dueTax = (100 + (giftValue - 5000) * 0.08);
            } else if (giftValue < 55000) {
                dueTax = (1700 + (giftValue - 25000) * 0.1);
            } else if (giftValue < 200000) {
                dueTax = (4700 + (giftValue - 55000) * 0.12);
            } else if (giftValue < 1000000) {
                dueTax = (22100 + (giftValue - 200000) * 0.15);
            } else {
                dueTax = (142100 + (giftValue - 1000000) * 0.17);
            }
            System.out.println("Tax: " + dueTax);
        }

    }
}
