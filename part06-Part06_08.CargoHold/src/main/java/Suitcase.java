import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {

            this.items.add(item);
        }
    }

    public String toString() {
        int listSize = this.items.size();
        String weightDisplay = " (" + this.totalWeight() + " kg)";
        String itemsDisplay = "";
        if (listSize == 0) {
            itemsDisplay = "no items";
        } else if (listSize == 1) {
            itemsDisplay = "1 item";
        } else {
            itemsDisplay = this.items.size() + " items";
        }
        return itemsDisplay + weightDisplay;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {

        int currentWeight = 0;

        for (Item item : this.items) {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

}
