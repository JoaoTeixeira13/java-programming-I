
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product product1 = new Product("Ashantismus");
        Product product2 = new Product("Avad", 8);
        Product product3 = new Product("Rhiñar", "Volantis");

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());

    }
}
