import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }

    public void start() {

        while (true) {

            System.out.println("?");
            String command = scanner.nextLine();

            switch (command) {

                case "Add":
                    this.addBird();
                    break;

                case "Observation":
                    this.observation();
                    break;

                case "All":
                    this.printAll();
                    break;

                case "One":
                    this.printOne();
                    break;

                case "Quit":
                    return;

                default:
                    break;
            }

        }

    }

    public void addBird() {
        System.out.println("Name:");
        String name = scanner.nextLine();

        System.out.println("Name in Latin:");
        String nameInLatin = scanner.nextLine();

        this.birds.add(new Bird(name, nameInLatin));
    }

    public void observation() {

        System.out.println("Bird?");
        String obervedBird = scanner.nextLine();
        boolean notABird = true;

        for (Bird bird : this.birds) {

            if (bird.getName().equals(obervedBird)) {
                bird.obervation();
                notABird = false;
            }
        }

        if (notABird) {
            System.out.println("Not a bird!");
        }

    }

    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }

    public void printOne() {
        System.out.println("Bird?");
        String birdToPrint = scanner.nextLine();
        boolean notABird = true;

        for (Bird bird : this.birds) {

            if (bird.getName().equals(birdToPrint)) {
                System.out.println(bird);
                notABird = false;
            }
        }
        if (notABird) {
            System.out.println("Not a bird!");
        }

    }

}
