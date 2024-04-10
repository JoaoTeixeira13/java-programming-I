
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {

            String printElements = "";
            int listSize = elements.size();
            for (int i = 0; i < elements.size(); i++) {
                printElements += elements.get(i) + (i == elements.size() - 1 ? "" : "\n");
            }
            return "The collection " + this.name + " has " + listSize + " element" + (listSize == 1 ? ":" : "s:") + "\n"
                    + printElements;
        }

    }

}
