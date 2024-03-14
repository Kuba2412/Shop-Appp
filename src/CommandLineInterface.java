import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineInterface {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Cart shoppingCart = new Cart();
    private static final OrderProcessor orderProcessor = new OrderProcessor();
    private static List<Product> productList;

    public static void main(String[] args) {
        int choice;

        do {
            mainMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProducts(productList);
                    break;
                case 2:
                    addToCart(productList);
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    processOrder();
                    ;
                    break;
                case 0:
                    System.out.println("Wyjście ze sklepu internetowego. Wracaj szybko :)");
                    break;
                default:
                    System.out.println("Błędny wybór.");
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void mainMenu() {
        System.out.println("Strona główna sklepu internetowego");
        System.out.println("Wyświetl produkty");
        System.out.println("Dodaj do koszyka");
        System.out.println("Wyświetl koszyk");
        System.out.println("Wyjście");
    }

    private static void processOrder() {
        System.out.println("Wpisz swoje imię: ");
        String firstName = scanner.next();
        System.out.println("Wpisz swoje nazwisko: ");
        String lastName = scanner.next();
        System.out.println("Wpisz swój email: ");
        String email = scanner.next();

        orderProcessor.processOrder(shoppingCart, firstName, lastName, email);
    }

    private static void displayProducts(List<Product> productList) {
        System.out.println("Dostępne produkty: ");
        for (Product product : productList) {
            System.out.println(product.getName() + " (" + product.getId() + ") " + product.getPrice() + " PLN");
        }
    }

    private static void addToCart(List<Product> productList) {

        displayProducts(productList);
        System.out.println("Wpisz ID produktu, który chcesz dodać do koszyka.");
        int productId = scanner.nextInt();

        if (productId == 0) {
            return;
        }
        Product selectedProduct = getProductById(productId, productList);

        if (selectedProduct != null) {
            shoppingCart.addToCart(selectedProduct);
            System.out.println("Produkt dodany do koszyka.");
        } else {
            System.out.println("Nie znaleziono produktu o numerze: " + productId);
        }
    }

    private static void viewCart() {
        shoppingCart.displayCart();
        System.out.println("Suma: " + shoppingCart.calculateTotal() + " PLN");

    }

    private static Product getProductById(int productId, List<Product> productList) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
