
public class Main {

    public static void main(String[] args) {
        // Test your Debt class here
        Debt mortgage = new Debt(50000.0, 1.04);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 10) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
