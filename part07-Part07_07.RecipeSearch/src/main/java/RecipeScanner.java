import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeScanner {

    private String file;
    private ArrayList<Recipe> recipes;

    public RecipeScanner(String file) {
        this.file = file;
        this.recipes = new ArrayList<>();
    }

    public void scan() {

        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(this.file))) {

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                list.add(row);

                if (row.equals("") || !fileScanner.hasNextLine()) {

                    int counter = 0;

                    String name = "";
                    int cookingTime = 0;
                    ArrayList<String> ingredients = new ArrayList<>();

                    for (String line : list) {

                        if (counter == 0) {
                            name = line;
                        } else if (counter == 1) {
                            cookingTime = Integer.valueOf(line);
                        } else {
                            ingredients.add(line);
                        }
                        counter++;
                    }

                    this.recipes.add(new Recipe(name, cookingTime, ingredients));
                    list.clear();

                }
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + this.file + " failed.");
        }

    }

    public ArrayList<Recipe> getRecipes() {
        return this.recipes;
    }

}
