
public class Main {
    public static void main(String[] args) {
        shop sklep = new shop();

        sklep.addProduct(new Product("Jabłko", 2, 15, productType.FRUIT));
        sklep.addProduct(new Product("Marchew", 1, 20, productType.VEGETABLE));
        sklep.addProduct(new Product("Laptop", 2500, 5, productType.OTHER));

        sklep.doOnProductList(20.0, 'J', 10.0, "FRUIT");
    }
}