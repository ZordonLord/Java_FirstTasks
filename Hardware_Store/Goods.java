package Hardware_Store;

public class Goods {
    protected String name;
    protected String color;
    protected double price;

    public Goods(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String displayInfo(){
        return String.format("Название: %s; Цвет: %s; Цена: %.2f руб.", name, color, price);
    }
}
