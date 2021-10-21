package Drugs;

import Drugs.Drug;

public class Nurofen extends Drug {
    private static int number = 0;

    public Nurofen(int price) {
        super.name = "Nurofen";
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
