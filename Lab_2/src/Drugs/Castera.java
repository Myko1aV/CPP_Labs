package Drugs;

public class Castera extends Drug {
    private static int number = 0;

    public Castera(int price) {
        super.name = "Castera";
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
