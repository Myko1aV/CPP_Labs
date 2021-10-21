package Drugs;

public class Suprastyn extends Drug {
    private static int number;

    public Suprastyn(int price) {
        super.name = "Suprastyn";
        super.type = "anti-allergic";
        super.Price = price;
        number++;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "type='" + type + '\'' +
                ", price='" + Price + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int getNumber() {
        return number;
    }
}
