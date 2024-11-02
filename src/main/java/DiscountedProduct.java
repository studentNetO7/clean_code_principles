//Применение принципа  ISP - интерфейс Discountable добавляет специфический метод getDiscount() только для тех продуктов, которые имеют скидки.
public class DiscountedProduct implements Product, Discountable{
    private String name;
    private double price;
    private double discount; // Процент скидки

    public DiscountedProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price * (1 - discount / 100); // Применение скидки
    }

    @Override
    public double getDiscount() {
        return discount; // Возвращает размер скидки
    }
}
