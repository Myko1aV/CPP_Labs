package Drugs;

public class Aleric extends Drug {
          private static int number = 0;

        public Aleric (int price) {
            super.name = "Aleric";
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
