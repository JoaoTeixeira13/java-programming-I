import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(String value) {
        list.add(value);
    }

    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        int lastIndex = this.list.size() - 1;
        String taken = this.list.get(lastIndex);
        this.list.remove(lastIndex);

        return taken;
    }
}
