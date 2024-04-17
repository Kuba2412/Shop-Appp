
/**
 * Klasa reprezentująca produkt w sklepie internetowym.
 */


public class Product {
    private int id;             // Identyfikator produktu
    private String name;         // Nazwa produktu
    private double price;        //  Cena produktu
    private boolean isAvailable;  // Dostępność produktu

    /**
     * Konstruktor klasy Product.
     *
     * @param id          Identyfikator produktu.
     * @param name        Nazwa produktu.
     * @param price       Cena produktu.
     * @param isAvailable Dostępność produktu.
     */

    public Product(int id, String name, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    // Gettery i settery

    /**
     * Zwraca tekstową reprezentację produktu.
     *
     * @return Tekstowa reprezentacja produktu.
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
