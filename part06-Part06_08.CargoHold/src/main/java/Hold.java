import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {

            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {

        int currentWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            currentWeight += suitcase.totalWeight();
        }

        return currentWeight;
    }

    public String toString() {
        int listSize = this.suitcases.size();
        String weightDisplay = " (" + this.totalWeight() + " kg)";
        String suitcasesDisplay = "";
        if (listSize == 0) {
            suitcasesDisplay = "no suitcases";
        } else if (listSize == 1) {
            suitcasesDisplay = "1 suitcase";
        } else {
            suitcasesDisplay = this.suitcases.size() + " suitcases";
        }
        return suitcasesDisplay + weightDisplay;
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
