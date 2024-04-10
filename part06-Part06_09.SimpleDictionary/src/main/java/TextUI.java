import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {

            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {

                case "end":
                    System.out.println("Bye bye!");
                    return;

                case "add":
                    this.addToDictionary();
                    break;

                case "search":
                    this.searchInDictionary();
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }

        }
    }

    private void addToDictionary() {
        System.out.println("Word: ");
        String word = scanner.nextLine();

        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        this.simpleDictionary.add(word, translation);
    }

    private void searchInDictionary() {
        System.out.println("To be translated: ");
        String word = scanner.nextLine();

        String translation = simpleDictionary.translate(word);

        String result = translation != null ? translation : "Word " + word + " was not found";

        System.out.println(result);

    }

}
