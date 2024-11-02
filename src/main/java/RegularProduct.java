//Применение принципа  ISP - не реализует интерфейс Discountable, поскольку ему не нужен метод для получения скидки.
public class RegularProduct implements Product {
    private String name;
    private double price;

    public RegularProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
