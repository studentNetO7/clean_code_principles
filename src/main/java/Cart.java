import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
// Применение принципа: Single Responsibility Principle (SRP) — отвечает только за добавление товаров в корзину:
    public void addProduct(Product product, int quantity) {
        int index = products.indexOf(product);
        if (index >= 0) {
            quantities.set(index, quantities.get(index) + quantity);
        } else {
            products.add(product);
            quantities.add(quantity);
        }
    }
// Применение принципа: Single Responsibility Principle (SRP) — метод отвечает только за вывод информации о покупке:
    public void printReceipt() {
        for (int i = 0; i < products.size(); i++) {
            if (quantities.get(i) > 0) {
                System.out.println("Вы купили " + products.get(i).getName() +
                        " за " + (quantities.get(i) * products.get(i).getPrice()));
            }
        }
    }
//    Применение принципа: DRY (Don't Repeat Yourself) — использует потоки для компактного и чистого вычисления общей стоимости.
    public double getTotal() {
        return IntStream.range(0, products.size())
                .mapToDouble(i -> products.get(i).getPrice() * quantities.get(i))
                .sum();
    }
}

