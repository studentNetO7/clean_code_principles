import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            store.showProducts();
            System.out.println("Введите номер товара и количество (или 0 для завершения):");
            int productNumber = scanner.nextInt();
            if (productNumber == 0) {
                break;
            }
            int productCount = scanner.nextInt();
            cart.addProduct(store.getProduct(productNumber - 1), productCount);
        }

        cart.printReceipt();
        double total = cart.getTotal();
        System.out.println("Общая стоимость составляет: " + total);
        scanner.close();
    }
}
