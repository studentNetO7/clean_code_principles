
// Применение принципа: Лисков (LSP)- позволяет использовать любые классы, которые его реализуют (например, RegularProduct, DiscountedProduct и потенциально другие классы).
// Применение принципа: Open-Closed Principle (OCP) - позволяет добавлять новые типы продуктов (например, со скидками) без изменения существующего кода
public interface Product {
    String getName();
    double getPrice();
}


