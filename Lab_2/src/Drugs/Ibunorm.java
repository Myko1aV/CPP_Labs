package Drugs;

public class Ibunorm extends Drug {

    private static int number = 0;

    public Ibunorm(int price) {
        super.name = "Ibunorm";
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
