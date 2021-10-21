package Drugs;

public class Tempalgin extends Drug {
    private static int number = 0;

    public Tempalgin(int price) {
        super.name = "tempalgin";
        super.type = "Analgesics";
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
