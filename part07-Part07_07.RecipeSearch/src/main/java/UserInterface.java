import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {

        System.out.println("File to read:");
        String file = scanner.nextLine();

        // Here implement a Recipe scanner that returns a list of recipes

        RecipeScanner recipeScanner = new RecipeScanner(file);
        recipeScanner.scan();

        this.recipes = recipeScanner.getRecipes();
        // System.out.println("Recipes after scanning are: " + this.recipes.toString());

        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("");

        while (true) {

            System.out.println("Enter command:");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    return;

                case "list":
                    for (Recipe recipe : this.recipes) {
                        System.out.println(recipe);
                    }
                    break;

                case "find name":
                    this.findName();
                    break;

                case "find cooking time":
                    this.findCookingTime();
                    break;

                case "find ingredient":
                    this.findIngredient();
                    break;

                default:
                    break;
            }

        }

    }

    public void findName() {

        System.out.println("Searched word:");
        String searchWord = scanner.nextLine();

        for (Recipe recipe : this.recipes) {

            if (recipe.getName().contains(searchWord)) {
                System.out.println(recipe);
            }

        }
    }

    public void findCookingTime() {

        System.out.println("Max cooking time:");
        int cookingTime = Integer.valueOf(scanner.nextLine());

        for (Recipe recipe : this.recipes) {

            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }

        }

    }

    public void findIngredient() {

        System.out.println("Ingredient:");
        String ingredient = scanner.nextLine();

        for (Recipe recipe : this.recipes) {

            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }

        }

    }

}
