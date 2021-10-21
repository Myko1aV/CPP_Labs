package Drugs;

public class Vitamin_B extends Drug {
    private static int number = 0;

    public Vitamin_B(int price) {
        super.name = "Vitamin_B";
        super.type = "Vitamins";
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
