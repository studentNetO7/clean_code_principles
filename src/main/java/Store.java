import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public Store() {
//    Добавляем обычные продукты
        // Добавляем несколько продуктов в магазине
        products.add(new RegularProduct("Молоко", 100)); // Принцип Лисков - ожидается объект типа Product, можно безопасно подставлять его реализацию RegularProduct
        products.add(new RegularProduct("Хлеб", 50));
        // Добавляем продукт со скидкой 10%
        products.add(new DiscountedProduct("Горчица", 40, 10)); // Принцип Лисков - ожидается объект типа Product, можно безопасно подставлять его реализацию DiscountedProduct
    }

    public void showProducts() {
        System.out.println("Доступные товары:");
        for (int i = 0; i < products.size(); i++) {//Применение принципа Магические числа
            Product product = products.get(i);
            String discountInfo = ""; // Переменная для информации о скидке

            // Проверяем, является ли продукт со скидкой
            if (product instanceof DiscountedProduct) {
                DiscountedProduct discountedProduct = (DiscountedProduct) product;
                discountInfo = String.format(" (Скидка: %.2f%%)", discountedProduct.getDiscount());
            }

            // Выводим информацию о продукте
            System.out.printf("%d - %s (Цена: %.2f%s)\n", i + 1, product.getName(), product.getPrice(), discountInfo);
        }
    }

    public Product getProduct(int index) {
        if (index < 0 || index >= products.size()) {
            throw new IndexOutOfBoundsException("Некорректный индекс продукта");
        }
        return products.get(index);
    }
}

