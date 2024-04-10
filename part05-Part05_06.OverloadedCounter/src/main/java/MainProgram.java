
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(3);
        System.out.println(counter.value());

        counter.decrease(2);
        System.out.println(counter.value());

        counter.increase(7);
        System.out.println(counter.value());

        counter.increase();
        System.out.println(counter.value());

        counter.decrease(2);
        System.out.println(counter.value());

        counter.decrease();
        System.out.println(counter.value());

    }
}
