package Hardware_Store;

public class Notebooks extends Goods{
    protected int ram;
    protected int rom;
    protected String os;

    public Notebooks(String name, String color, double price, int ram, int rom, String os) {
        super(name, color, price);
        this.ram = ram;
        this.rom = rom;
        this.os = os;
    }

    public int getRam(){
        return ram;
    }

    public int getRom(){
        return rom;
    }

    @Override
    public String displayInfo(){
        return String.format("Ноутбук: %s; Цвет: %s; Цена: %.2f руб.; ОЗУ: %d GB; Диск: %d GB; OS: %s", name, color, price, ram, rom, os);
    }
}
