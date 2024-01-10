import java.util.ArrayList;
import java.util.List;

public class shop {
    private List<Product> listaProduktow = new ArrayList<>();
    public void addProduct(Product produkt) {
        listaProduktow.add(produkt);
    }
    public void doOnProductList(double cenaLimit, char pierwszaLitera, double procentZmiany, String rodzajProduktu) {
        System.out.println("Produkty o cenie wyższej niż " + cenaLimit + " zł:");
        listaProduktow.stream()
                .filter(p -> p.quantity > cenaLimit)
                .forEach(Product::getInfo);
        System.out.println("\nZmiana ceny produktów z kategorii " + rodzajProduktu + " o " + procentZmiany + "%:");
        listaProduktow.stream()
                .filter(p -> p.type.name().startsWith(rodzajProduktu))
                .forEach(p -> p.setPrice((int) (p.brutto * (1 + procentZmiany / 100))));
        System.out.println("\nŁączna wartość produktów netto jednego rodzaju:");
        listaProduktow.stream()
                .filter(p -> p.type.name().startsWith(rodzajProduktu))
                .mapToDouble(p -> p.brutto * p.quantity)
                .forEach(System.out::println);
        System.out.println("\nUsuwanie produktów zaczynających się na literę " + pierwszaLitera + ":");
        listaProduktow.stream()
                .filter(p -> p.type.name().startsWith(rodzajProduktu) && p.name.startsWith(String.valueOf(pierwszaLitera)))
                .forEach(p -> p.changeQuantity(0));
        System.out.println("\nPełna informacja o wszystkich rodzajach produktów:");
        listaProduktow.forEach(Product::getInfo);
    }
}
